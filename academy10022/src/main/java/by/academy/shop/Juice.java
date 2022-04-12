package by.academy.shop;

public class Juice extends Product {
    protected String taste;

    protected Juice (double price, int quantity, String name, String taste) {
        super (price,quantity,name,"сок");
        this.taste = taste;
    }
    @Override
    protected double getDiscount() {
        if (price > 15) {
            return 0.8;
        }
        return 1;
    }

    protected void flavor () {

        System.out.println("Вкус сока: " + taste);
    }

    public String getTaste () {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
