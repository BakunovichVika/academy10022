package by.academy.cycle;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {

        System.out.println("Введите n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Введите x:");
        double x = scanner.nextDouble();

        double c = Math.toRadians(x);
        double d = 0;

        for (int i = 1; i <= n; i++) {
            double a = Math.sin(Math.pow(c, i));
            d += a;
        }

        System.out.println(d);

    }
}
