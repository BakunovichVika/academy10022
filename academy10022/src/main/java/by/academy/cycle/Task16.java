package by.academy.cycle;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество сенокосилок: ");
        int n = sc.nextInt();

        System.out.println("Введите количество часов: ");
        int m = sc.nextInt();

        int minut = m * 60;

        for (int i =1; i<n; i++) {
            minut+=10;
        }
        System.out.println("Вся бригада проработала " + minut + " минут");
    }
}
