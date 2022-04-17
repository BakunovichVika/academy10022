package by.academy.shop;

import by.academy.lesson12.Producer;

@Producer(startYear = 2022, founderFullName = "Романов Пётр Алексеевич")
public class Milk extends Product {
    protected String vegetarian;

    protected Milk(double price, int quantity, String name, String type, String vegetarian) {
        super(price, quantity, name, type);
        this.vegetarian = vegetarian;
    }

    @Override
    protected double getDiscount() {
        if (quantity < 5) {
            return 0.8;
        }
        return 1;
    }

    protected void veget () {
        System.out.println("Молоко является: " + vegetarian);
    }

    public String getVegetarian () {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }
}
