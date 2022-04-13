package by.academy.massive;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[51];
        int i = 0;
        int a = 1;

        while (i < 50) {
            array[i] = a;
            a += 2;
            i++;
        }

        for (i = 0; i < 50; i++)
            System.out.print(array[i] + " ");

        System.out.println();

        for (i = 49; i >= 0; i--)
            System.out.print(array[i] + " ");
    }
}
