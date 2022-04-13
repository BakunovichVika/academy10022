package by.academy.lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (n + 1));
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] += 9;
            array[i]++;
        }
        System.out.println(Arrays.toString(array));
    }
}

