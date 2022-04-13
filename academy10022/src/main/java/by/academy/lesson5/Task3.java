package by.academy.lesson5;

import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        int n = sc.nextInt();

        int i;
        int proiz;
        for (i = 0; i <= n; i++) {
            proiz = i*i;
            System.out.println("Произведение чисел = " + proiz);
        }

    }
}
