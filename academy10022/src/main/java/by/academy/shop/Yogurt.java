package by.academy.shop;

public class Yogurt extends Product {
    protected String flavor;

    public Yogurt(double price, int quantity, String name, String type, String flavor) {
        super(price, quantity, name, type);
        this.flavor = flavor;
    }

    @Override
    protected double getDiscount() {
        if (price > 10) {
            return 0.8;
        }
        return 1;
    }

    protected void flavour() {
        System.out.println("Вкус йогурта: " + flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}


