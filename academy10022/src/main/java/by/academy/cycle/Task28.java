package by.academy.cycle;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        System.out.println("Введите количество тысяч рублей: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        System.out.println("Введите конечную сумму: ");
        double s = scanner.nextDouble();

        int year = 0;
        while (m <= s) {
            year++;
             m *= 1.2;
        }
        System.out.println("Долг превысит через: " + year);
    }
}
