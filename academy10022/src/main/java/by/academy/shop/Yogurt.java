package by.academy.shop;

public class Yogurt extends Product {
    protected double date;

    protected Yogurt (double price, int quantity, String name, double date) {
        super(price,quantity,name,"молочные продукты");
        this.date = date;
    }
    @Override
    protected double getDiscount() {
        if (date > 10) {
            return 0.8;
        }
        return 1;
    }


    protected void dating () {
        System.out.println("Срок годности йогурта: " + date);
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }
}
