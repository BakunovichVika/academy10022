package by.academy.massive;

public class Task6 {
    public static void main(String[] args) {

        int array[] = new int[4];
        int i;
        int massive = 0;

        for (i = 0; i < 4; i++) {
            array[i] = (int) (10 + Math.random() * 90);
        }

        for (int a : array) {
            System.out.print(a + " ");
        }

        for (i = 0;i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                massive = 1;
                break;
            }

            if (massive==1) {
                System.out.println("Массив строго возрастающей последовательности");
            }
            else {
                System.out.println("Массив не является строго возрастающей последовательностью");
            }
        }
    }
}
