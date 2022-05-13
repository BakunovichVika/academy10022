package by.academy.lesson19;

public class OrderItem {

    private double itemPrice;
    private int quantity;

    public OrderItem() {
        super();
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "itemPrice=" + itemPrice +
                ", quantity=" + quantity +
                '}';
    }
}
