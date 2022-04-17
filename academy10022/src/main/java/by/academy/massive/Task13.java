package by.academy.massive;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        int n = 0, i = 0, a = 0;

        do {
            System.out.println("Введите число большее 3: ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 3) {
                    int array[] = new int[n];
                    for (i = 0; i < array.length; i++) {
                        array[i] = (int) (Math.random() * (n + 1));
                        System.out.print(array[i] + " ");
                        if (array[i] % 2 == 0) {
                            a++;
                        }
                    }
                    System.out.println();
                    if (a > 0) {
                        int array1[] = new int[a];
                        a=0;
                        for (i = 0; i < array.length; i++) {
                            if (array[i] % 2 == 0) {
                                array1[a] = array[i];
                                System.out.print(array1[a] + " ");
                                a++;
                            }
                        }
                    } else {
                        System.out.println("Нет четных чисел");
                    }
                }
            }
        } while (n<=3);
    }
}
