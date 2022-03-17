package by.academy.homework1;

import java.util.Scanner;

public class task3 {
    static public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10: ");
        int a = sc.nextInt();

        if (a <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(a * i);
            }
        }
        else {
            System.out.println("Число не входит в диапазон!");
        }
    }
}

