package by.academy.lavka;

public class Apple extends Fruct {

    protected Apple (double weight, double price) {
        super();
        this.weight = weight;
        this.price = price;
    }
    @Override
    protected double getPrice () {
        System.out.println("Цена яблока = " + weight * price);
        return 1;
    }
}
