package by.academy.cycle;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        int c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите числа a и b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b<0) {
            System.out.println("Введите не отрицательное число b: ");
            b = sc.nextInt();
        }

        while (b==0) {
            System.out.println("Введите не нулевое число b: ");
            b = sc.nextInt();
        }

        c = (int) Math.pow(a,b);
        System.out.println(c);
    }
}
