package by.academy.lesson5;

import java.io.IOException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        int n = sc.nextInt();
        int array[] = new int[n];

        System.out.println("Введите " + n + " чисел");
        int a;
        int negativ = 0;
        for (a = 0; a <= n; a++) {
            array[a] = sc.nextInt();
            System.out.println("Введеные числа = " + array[a]);
        }
        for (a = 0; a <= n; a++) {
            if (a < 0) {
                negativ++;
                System.out.println("Количество отрицальных чисел = " + negativ);
            }

        }
    }
}


