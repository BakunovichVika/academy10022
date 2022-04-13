package by.academy.massive;

public class Task9 {
    public static void main(String[] args) {
        int[] array1 = new int[10], array2 = new int[10];
        double[] array3 = new double[10];
        int i = 0;
        int j = 0;

        for (i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 6);
            array2[i] = (int) (Math.random() * 6);
            array3[i] = (double) array1[i] / array2[i];
        }
        System.out.println();
        for (i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
            if (array3[i] % 1 == 0) {
                j++;
            }
        }
        System.out.println();
        System.out.println(j);
    }
}