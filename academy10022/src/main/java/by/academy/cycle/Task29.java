package by.academy.cycle;

import java.util.Scanner;

public class Task29 {
    public static void main (String[] args) {

        int n;
        do {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }
        while (n > 2 & n < 100);
    }
}
