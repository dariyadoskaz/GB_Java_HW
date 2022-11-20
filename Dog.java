package lesson6;

public class Dog extends Animal{
    public Dog(String nickname, int distance) {
        super(nickname, distance,500, 10);
    }

    @Override
    public void doAction() {
        System.out.printf("%s пробежал %s м.%n", super.getNickname(), super.getDistance());
    }
}
