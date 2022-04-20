package by.academy.cycle;

import java.util.Scanner;

public class Task2 {

    public static void main (String[] args) {

        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            int sum = i+i;
            System.out.println("Сумма чисел " + i + ": " + sum);
        }
    }
}
