
package by.academy.homework1;

import java.util.Scanner;

public class task1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите сумму покупки: ");
        int price = sc.nextInt();

        Scanner sca = new Scanner (System.in);
        System.out.println("Введите возраст покупателя:");
        int age = sca.nextInt();

        if (price < 100) {
            System.out.println("Ваша скидка 5%, финальная цена = " + (price - (price*0.05)));
        }
        else if (price < 200 && price >= 100) {
            System.out.println("Ваша скидка 7%, финальная цена = " + (price - (price*0.07)));
        }
        else if (price < 300 && price >= 200) {
            if (age >= 18) {
                System.out.println("Ваш возраст:" + age + "." + " Ваша скидка 16%, финальная цена = " + (price - (price*0.16)));
            }
            else
            System.out.println("Ваш возраст:" + age + "." + " Ваша скидка 9%, финальная цена = " + (price - (price*0.09)));
        }
        else if (price < 400 && price >= 300) {
            System.out.println("Ваша скидка 15%, финальная цена = " + (price - (price*0.15)));
        }
        else if (price >= 400) {
            System.out.println("Ваша скидка 20%, финальная цена = " + (price - (price*0.20)));
        }
        sc.close();
        sca.close();
    }
}