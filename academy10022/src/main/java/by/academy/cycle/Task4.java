package by.academy.cycle;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int a, negativ = 0, pozitiv = 0, nol = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        int n = sc.nextInt();
        int array[] = new int[n];

        System.out.println("Введите " + n + " чисел");

        for (a = 0; a < n; a++) {
            array[a] = sc.nextInt();
        }


        for (a = 0; a < n; a++) {

            if (a < 0) {
                negativ++;
            } else if (a > 0) {
                pozitiv++;
            } else if (a == 0) {
                nol++;
            }
        }

        System.out.println("Количество отрицальных чисел = " + negativ);
        System.out.println("Количество положительных чисел = " + pozitiv);
        System.out.println("Количество нулей = " + nol);
    }
}
