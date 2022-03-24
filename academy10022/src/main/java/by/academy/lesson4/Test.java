package by.academy.lesson4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        for (int i = 10; i <= 20; i++) {
//            System.out.println("Квадраты чисел:" + i * i);

//        System.out.println("Введите количество чисел: ");
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i<=n; i++) {
//
//            System.out.println("Сумма чисел: " + (i+i));
//        }

        System.out.println("Введите количество чисел: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Введите числа: ");
        int array[] = new int[size];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
        for (i = 0; i < array.length; i++) {
            if (array[i]<0) {
                int otri = 0;
                otri++;
                System.out.println("Отрицательные числа: " + otri);
            }
        }
    }
}

