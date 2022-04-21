package by.academy.lesson13;

import java.util.*;

public class Task1 {
        public static void main (String[] args) {

            System.out.println("Введите строку из чисел");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            String[] numbers = str.split(",");

            HashSet<String> set = new HashSet<String>();
            set.addAll(List.of(numbers));
            System.out.println(set);
        }
}
