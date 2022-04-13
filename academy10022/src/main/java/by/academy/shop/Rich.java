package by.academy.shop;

public class Rich extends Juice {
    double volume;

    public Rich(double price, int quantity, String name, String type, String taste, double volume) {
        super(price, quantity, name, type, taste);
        this.volume = volume;
    }

    protected void flavor () {
        System.out.println("Вкус сока: " + taste);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Rich{" +
                "taste='" + taste + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                '}';
    }
}
