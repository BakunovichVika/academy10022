package by.academy.massive;

public class Task7 {
    public static void main(String[] args) {

        int a0 = 1;
        int a1 = 1;
        int a2;

        System.out.print(a0 + " " + a1 + " ");

        for (int i = 3; i <= 20; i++) {
            a2 = a0 + a1;
            System.out.print(a2 + " ");
            a0 = a1;
            a1 = a2;
        }
    }
}