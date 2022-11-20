package lesson6;

public abstract class Animal {
    private String nickname;
    private int distance;
    private final int limitRun;
    private final int limitSwim;

    public Animal(String nickname, int distance, int limitRun, int limitSwim) {
        this.nickname = nickname;
        this.distance = distance;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void printInfo(){
        System.out.printf("%s макс дистанция бега %s м и заплыва %s м.%n", nickname, limitRun, limitSwim);
    }

    public abstract void doAction();

}
