package by.academy.cycle;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {

        int i=0, a=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = sc.nextInt();

        for (i = 1; i<n; i++) {
            if (i%2!=0 & i%3!=0 & i%5!=0) {
                System.out.println(i);
                a++;
            }
        }
        System.out.println("Количество: " + a);
    }
}
