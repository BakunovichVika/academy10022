package by.academy.massive;

public class Task16 {
    public static void main(String[] args) {

        int[][] array = new int[4][7];
        int proiz = 1, proizmax = 0, imax = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11 - 5);
            }
        }

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                proiz = proiz * array[i][j];
            }
            if (Math.abs(proiz) > Math.abs(proizmax)) {
                imax = i;
                proizmax = proiz;
            }
            System.out.println("Произведение строки " + i + ": " + proizmax);
            proiz = 1;
        }
        System.out.println();
        System.out.println("Наибольший индекс " + imax);
    }
}
