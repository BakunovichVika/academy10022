package by.academy.homework2;

import java.util.Scanner;

public class StringTask3 {
    public static void main (String[] args) {


        System.out.println("Введите слова: ");
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String result = null;

        if (word1.length() % 2 == 1) {
            System.out.println("Введите слово из четного количества букв!");
        }
        else if (word2.length() % 2 == 1) {
            System.out.println("Введите слово из четного количества букв!");
        }
        else {
            result = (word1.substring(0, word1.length() / 2)) + (word2.substring(word2.length() / 2, word2.length()));
            System.out.println(result);
        }
    }
}
