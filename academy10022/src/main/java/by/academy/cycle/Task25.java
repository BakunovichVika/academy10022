package by.academy.cycle;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        System.out.println("Введите n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Введите a:");
        double a = scanner.nextDouble();

        double c = a;
        double b;

        for (int i = 1; i < n; i++) {
            b = a + i;
            c *= b;
        }

        System.out.println(c);
    }
}
