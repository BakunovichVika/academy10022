package by.academy.massive;

public class Task8 {
    public static void main(String[] args) {

        int array[] = new int[12];
        int i;
        int max = 0, j = 0;

        for (i = 0; i < 12; i++) {
            array[i] = (int) ((-15) + Math.random() * 30);
        }

        for (int a : array) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array [i];
                j = i;
            }
        }
        System.out.println("Максимальное число " + array [j]);
        System.out.println("Индекс максимального числа " + j);
        }
    }

