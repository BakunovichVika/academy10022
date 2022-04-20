package by.academy.cycle;

import java.util.Scanner;

public class Task22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();

        double a = 0,sum = 0;

        for (int i=1;i<=n;i++) {
           a=(double) 1/i;
           System.out.print(a + " ");
            sum += a;
        }

        System.out.println();
        System.out.println("Сумма = " + sum);
    }
}
