package by.academy.cycle;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();

        double a;
        double b = 0;

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                a = Math.pow(i * 2, 2);
                b = b + Math.pow(a, -1);
            }

            else if (i % 2 == 0) {
                a = Math.pow(i, 2);
                b = b + Math.pow(a, -1);
            }
        }
        System.out.println(b);
    }
}
