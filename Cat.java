package lesson7;

public class Cat {
    public String name;
    public int appetite;
    public boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate plate) {
        System.out.println(this + " приготовился к трапезе");
        plate.decreaseFood(appetite);
        System.out.println(this + " съел " + appetite + " единиц еды");
    }

    @Override
    public String toString() {
        return name;
    }
}
