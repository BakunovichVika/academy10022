package by.academy.homework2;

import java.util.Scanner;

public class Deal {
    public static void main (String[] args) {

        int cards = 5;
        System.out.println("Введите количество игроков: ");
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();

        String [] mast = {"Пики", "Крести", "Черви", "Бубны"};
        String [] rang = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        int all = mast.length * rang.length;

        if (cards*players > all) {
            System.out.println("Количество игроков превышает возможное");
        }
        else if (players <= 0) {
            System.out.println("Игра невозможна");
        }
        else {
            System.out.println("Игра началась!");
        }

        String[] coloda = new String[all];
        for (int i = 0; i < rang.length; i++) {
            for (int j = 0; j < mast.length; j++) {
                coloda[mast.length*i + j] = rang[i] + " " + mast[j];
            }
        }

        for (int i = 0; i < all; i++) {
            int a = i + (int) (Math.random() * (all-i));
            String temp = coloda[a];
            coloda[a] = coloda[i];
            coloda [i] = temp;
        }

        for (int i = 0; i < players * cards; i++) {
            System.out.println(coloda[i]);
            if (i % cards == cards - 1)
                System.out.println();
        }
    }
}
