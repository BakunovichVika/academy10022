package by.academy.homework1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип данных: ");
        String type = sc.nextLine();

        Scanner sca = new Scanner(System.in);
        System.out.println("Введите переменную: ");
        int perem = sc.nextInt();

        switch (type) {
            case "int":
                System.out.println("Остаток от деления на 2: " + (perem % 2));
                break;
            case "double":
                System.out.println("70% от числа: " + (perem*0.7));
                break;
            case "float":
                System.out.println("Квадрат числа: " + (perem*perem));
                break;
            case "char":
                System.out.println("Код символа: " + type.charAt(0));
                break;
            case "String", "string":
                System.out.println("Hello " + perem);
                break;
            default:
                System.out.println("Unsupported type");

        }

    }
}