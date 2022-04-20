package by.academy.cycle;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Введите пару чисел: ");
            int n = sc.nextInt();
            int s = sc.nextInt();

            if (n>s) {
                System.out.println("Большее число: " + n);
            } else if (s>n){
                System.out.println("Большее число: " + s);
            } else
                System.out.println("Числа равны");
        }
    }
}
