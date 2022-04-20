package by.academy.cycle;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        double summa = 0;
        int h;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество учащихся: ");
        int n = sc.nextInt();

        System.out.println("Введите рост учащихся: ");
        for (int i = 0; i<n; i++) {
            h = sc.nextInt();
            summa += h;
        }
        double sr = summa/n;
        System.out.println("Средний рост: " + sr);
    }
}
