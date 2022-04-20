package by.academy.cycle;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Введите пару чисел: ");
//            int n = sc.nextInt();
//            int s = sc.nextInt();
//
//        while (n<10 || n>99) {
//            System.out.println("Введите двузначное число: ");
//            n = sc.nextInt();
//        }
//
//        while (s<10 || s>99) {
//            System.out.println("Введите двузначное число: ");
//            s = sc.nextInt();
//        }

        for (int n = 10; n < 100; n++) {
            for (int s = 10; s < 100; s++) {
                int a = n * 100 + s;
                int b = n * s;
                if (a % b == 0) {
                    System.out.println("Число: " + a);
                    System.out.println(a / b);
                }
            }
        }
    }
}
