package by.academy.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        System.out.println("Введите количество строк");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите строки");
        String[] arr = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        int min = arr[0].length();
        int max = arr[0].length();
        String maxString = arr[0];
        String minString = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i].length() < min) {
                min = arr[i].length();
                minString = arr[i];
            } else if (arr[i].length() > max) {
                max = arr[i].length();
                maxString = arr[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Min string : " + minString);
        System.out.println("Max: " + max);
        System.out.println("Max string: " + maxString);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
