package by.academy.homework2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringTask2 {
    public static void main (String[] args) {


        System.out.println("Введите слова: ");
        String words[] = new String[0];
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        words = text.split(" ");

        String minWord = words [0];
        int sizeMinWord = new HashSet<String> (Arrays.asList(words[0].split(" "))).size();

        for (String slovo : words) {
            Set <String> set = new HashSet<String>(Arrays.asList(slovo.split("")));
            if (set.size() < sizeMinWord) {
                minWord = slovo;
                sizeMinWord = set.size();
            }
        }
        System.out.println(minWord);

    }
}
