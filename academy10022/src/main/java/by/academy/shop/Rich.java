package by.academy.shop;

public class Rich extends Juice {
    double volume;

    protected Rich (double price, int quantity, String name, String taste, double volume) {
        super (price,quantity,name,taste);
        this.volume = volume;
        this.taste = taste;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    protected void flavor () {

        System.out.println("Вкус сока: " + taste);
    }

    public double getVolume() {
        return volume;
    }
}
