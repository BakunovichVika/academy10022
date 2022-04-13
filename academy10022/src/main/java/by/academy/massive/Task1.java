package by.academy.massive;

public class Task1 {
    public static void main(String[] args) {

        int[] array = new int[10];
        int i = 0;
        int a = 2;

        while (i < 10) {
            array[i] = a;
            a += 2;
            i++;
        }

        for (i = 0; i < 10; i++)
            System.out.print(array[i] + " ");

        System.out.println();

        for (i = 0; i < 10; i++)
            System.out.println(array[i]);
    }
}