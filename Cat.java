package lesson6;

public class Cat extends Animal{
    public Cat(String nickname, int distance) {
        super(nickname, distance, 200, 0);
    }

    @Override
    public void doAction() {
        System.out.printf("%s пробежал %s м.%n", super.getNickname(), super.getDistance());
    }
}
