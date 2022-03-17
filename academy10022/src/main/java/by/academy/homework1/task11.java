package by.academy.homework1;

import java.util.Scanner;

public class task11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите сумму покупки: ");
        int price = sc.nextInt();

        Scanner sca = new Scanner (System.in);
        System.out.println("Введите возраст покупателя:");
        int age = sca.nextInt();

        double discount = 0, konez;

        if (price < 100) {
            discount = 0.05;
        }
        else if (price < 200 && price >= 100) {
            discount = 0.07;
        }
        else if (price < 300 && price >= 200) {
            if (age >= 18) {
                discount = 0.16;
            }
            else
                discount = 0.9;
        }
        else if (price < 400 && price >= 300) {
            discount = 0.15;
        }
        else if (price >= 400) {
            discount = 0.2;
        }

        konez = price - (price*discount);
        System.out.println("Сумма вашей покупки: " + price + "\nФинальная сумма: " + konez);

        sc.close();
        sca.close();
    }

}
