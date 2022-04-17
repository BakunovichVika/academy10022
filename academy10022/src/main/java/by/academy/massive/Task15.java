package by.academy.massive;

public class Task15 {
    public static void main(String[] args) {

        int[][] array = new int[8][5];
        int max = 0, a=0,b=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 199 - 99);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Максимальное число " + max);
    }
}
