package by.academy.lavka;

public abstract class Lavka_test extends Fruct {
    public static void main(String[] args) {

        Apple apple = new Apple(0.5, 10);
        Apricot apricot = new Apricot(0.3, 13);
        Pear pear = new Pear(0.4, 11);
        apple.getPrice();
        pear.getPrice();
        apricot.getPrice();
    }
}
