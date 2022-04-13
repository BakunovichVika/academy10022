package by.academy.massive;

public class Task4 {
    public static void main(String[] args) {

        int array[] = new int[8];
        int i;
        int a = 0;

        for (i = 0; i < 8; i++) {
            array[i] = (int) (1 + Math.random() * 10);
        }

        for (int b : array) {
            System.out.print(b + " ");
        }

        System.out.println();

        for (int b = 0; b < 8; b++) {
            if (array[b] % 2 == 1) {
                array[b] = 0;
            }
            System.out.print(array[b] + " ");
        }
    }
}
