package by.academy.shop;

public abstract class Product {
    protected double price;
    protected int quantity;
    protected String name;
    protected String type;


    protected Product() {
        super();
    }

    protected Product(double price, int quantity, String name, String type) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.type = type;
    }

    protected final double getCalculatedPrice() {
        return price * quantity;
    }

    protected abstract double getDiscount();

    protected void print() {

        System.out.println("Продукт: " + quantity);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
