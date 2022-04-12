package by.academy.shop;

import java.util.Arrays;

public class Deal_ {
    protected String place;
    protected User buyer;
    protected User seller;
    protected Product[] basket;
    protected int index = 0;

    public Deal_ () {
        super();
    }

    public Deal_ (String place, User buyer, User seller) {
        this.place = place;
        this.buyer = buyer;
        this.seller = seller;
    }

    public void addProduct (Product product) {
        if (basket == null ) {
            index = 0;
            basket = new Product [10];
        }
        if (index >= basket.length) {
            basketGrow ();
        }
        basket [index++] = product;
    }

    private void basketGrow() {
        Product[] tempBasket = new Product[basket.length * 2 +1];
        System.arraycopy(basket, 0, tempBasket, 0, basket.length);
        basket = tempBasket;
    }

    public void removeProduct (int removeIndex) {
        if (removeIndex < basket.length && removeIndex >= 0) {
            System.arraycopy(basket, removeIndex+1, basket, removeIndex, basket.length-removeIndex-1);
        basket [-- index] = null;
        }
    }

    protected void deal_(){
        if (basket == null) {
            System.out.println("Корзина пуста!");
            return;
        }

        double fullPrice = 0;
        for (Product p: basket ) {
        fullPrice += p.getCalculatedPrice();
        }
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "Deal_{" +
                "place='" + place + '\'' +
                ", buyer=" + buyer +
                ", seller=" + seller +
                ", basket=" + Arrays.toString(basket) +
                '}';
    }
}
