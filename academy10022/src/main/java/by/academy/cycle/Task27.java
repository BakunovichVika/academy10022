package by.academy.cycle;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {

        System.out.println("Введите количество рублей:");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        System.out.println("Введите цену мороженого:");
        double k = scanner.nextDouble();

        int quantity=0;
        while (m>=k) {
            m -= k;
            quantity++;
        }
        System.out.println("У Пети останется " + m + " рублей. Он купил " + quantity + " мороженок");
    }
}
