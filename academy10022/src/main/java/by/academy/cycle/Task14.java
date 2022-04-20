package by.academy.cycle;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        int sum=0, kvadrat = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();

        for (int i =1; i<=n; i++) {
            kvadrat=i * i;
            System.out.print(kvadrat + " ");
            sum += kvadrat;
        }
        System.out.println();
        System.out.println("Сумма чисел: " + sum);
    }
}
