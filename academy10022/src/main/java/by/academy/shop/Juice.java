package by.academy.shop;

import by.academy.lesson12.Producer;

@Producer(startYear = 2022, country = "Грузия", founderFullName = "Шестепёров Сергей Мигельевич")
public class Juice extends Product {
    protected String taste;

    public Juice(double price, int quantity, String name, String type, String taste) {
        super(price, quantity, name, type);
        this.taste = taste;

    }

    @Override
    protected double getDiscount() {
        if (price > 15) {
            return 0.8;
        }
        return 1;
    }

    protected void taste () {
        System.out.println("Вкус сока: " + taste);
    }

    public String getTaste () {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

}
