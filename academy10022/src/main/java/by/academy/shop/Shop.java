package by.academy.shop;

import java.time.LocalDate;

public class Shop {

    public static void main(String[] args) {
        User buyer = new User(20, "Вика", 1000);
        User seller = new User(19, "Яна", 1000);
        Product[] basket = new Product[3];
        Milk milk = new Milk(15.5, 3, "Савушкин", "Молоко", "Вегетерианское");
        Yogurt yogurt = new Yogurt(20, 2, "Матроскин", "Молочный продукт", "Клубничный");
        Juice juice = new Juice(15, 1, "Rich", "Сок", "Яблочный");

        basket[0] = milk;
        basket[1] = yogurt;
        basket[2] = juice;

        Deal_ deal_ = new Deal_("Минск", buyer, seller);
        System.out.println(deal_);

        deal_.addProduct(milk);
        deal_.addProduct(juice);
        deal_.addProduct(yogurt);

        System.out.println(deal_);

        deal_.removeProduct(1);
        System.out.println(deal_);

//        Milk milk1 = new Milk(15.5, 6, "Cow", "vegetarian");
//        milk1.veget();
//        juice.dateIs();

        Validator emailValid = new Validator() {

            @Override
            public boolean validate(String valid) {
                if (Regex.checkEmail(valid) == true) {
                    return true;
                } else {
                    return false;
                }
            }

        };
    }
}
