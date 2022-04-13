package by.academy.massive;

public class Task3 {

    public static void main(String[] args) {

        int array[] = new int[15];
        int a = 0;
        int i;

        for (i = 0; i < 15; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        for (int b : array) {
                System.out.print(b + " ");
            }

            System.out.println();

            for (int b = 0; b < 15; b++) {
                if (array[b] % 2 == 0) {
                    System.out.print(array[a] + " ");
                }
                a++;
            }
    }
}
