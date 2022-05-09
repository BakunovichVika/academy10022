package by.academy.lesson17;

import by.academy.lesson1.Cat;

public class Tiger extends Cat {
    public String color;
    protected int friend;
    private String home;

    public Tiger(String color, int friend, String home) {
        this.color = color;
        this.friend = friend;
        this.home = home;
    }

    public Tiger(int age, String color, int friend, String home) {
        super(age);
        this.color = color;
        this.friend = friend;
        this.home = home;
    }

    public Tiger(int age, String nickname, String peculiarities, String color, int friend, String home) {
        super(age, nickname, peculiarities);
        this.color = color;
        this.friend = friend;
        this.home = home;
    }

    public Tiger(int age, String nickname, String color, int friend, String home) {
        super(age, nickname);
        this.color = color;
        this.friend = friend;
        this.home = home;
    }

    private void print(){
        System.out.println(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFriend() {
        return friend;
    }

    public void setFriend(int friend) {
        this.friend = friend;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "age=" + age +
                ", peculiarities='" + peculiarities + '\'' +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                ", home='" + home + '\'' +
                '}';
    }
}
