package by.academy.homework2;

import java.util.Scanner;

public class StringTask1 {

    public static void main(String[] args) {

        System.out.println("Введите слова: ");
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        System.out.println(word1);
        System.out.println(word2);

        sc.close();
    }

    public boolean permutation(String word1, String word2) {
        if (word1.length() != word2.length()) {
            System.out.println("Строки не совпадают");
            return false;
        }

        int[] letters = new int[256];
        char[] word1_array = word1.toCharArray();
        for (char a : word1_array) {
            letters[a]++;
        }

        for (int i = 0; i < word2.length(); i++) {
            int a = (int) word2.charAt(i);
            if (--letters[a] < 0) {
                System.out.println("Строки не совпадают");
                return false;
            }
        }
        return true;
    }
}
