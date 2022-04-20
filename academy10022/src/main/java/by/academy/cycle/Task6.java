package by.academy.cycle;

import java.util.Scanner;

public class Task6 {

    public static void main (String [] args) {

        double itog = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество лет: ");
        int n = sc.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        double s = sc.nextInt();

        for (int i = 0; i<=n; i++) {
            itog = s * 1.03 * n;
        }

        System.out.println("Сумма равна " + itog);
    }
}
