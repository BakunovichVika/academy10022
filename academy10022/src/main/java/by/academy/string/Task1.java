package by.academy.string;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Введите количество строк:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max=0;

        String str[]=new String[n];
        str[0]=scanner.nextLine();

        System.out.println("Введите " + n + " строк: ");
        for (int i=0;i<str.length;i++) {
            str[i] = scanner.nextLine();
        }

        for (int i=0;i<str.length;i++){
            if (max<str[i].length()) {
                max=str[i].length();
            }
        }

        System.out.println("Самая длинная строка: " + max);
        System.out.println("Длина строки: " + str.length);

    }
}
