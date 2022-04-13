package by.academy.lavka;

public class Apricot extends Fruct {

    protected Apricot (double weight, double price) {
        super();
        this.weight = weight;
        this.price = price;
    }

    @Override
    protected double getPrice () {
        System.out.println("Цена абрикоса = " + weight * price);
        return 1;
    }
}
