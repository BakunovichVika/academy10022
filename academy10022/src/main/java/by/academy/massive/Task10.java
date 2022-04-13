package by.academy.massive;

public class Task10 {
    public static void main(String[] args) {

    
        int array[] = new int[11];
        int i;
        int a = 0, b = 0, c = 0;

        for (i = 0; i < 11; i++) {
            array[i] = (int) ((-1) + Math.random() * 3);
        }

        for (int d : array) {
            System.out.print(d + " ");
        }

        for (i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                a++;
            } else if (array[i] == 1) {
                b++;
            } else if (array[i] == 0) {
                c++;
            }
        }

        System.out.println();

        if(a>b && a>c) {
            System.out.println("Больше всего чисел = -1, их количество: " + a);
        } else if(b>a && b>c) {
            System.out.println("Больше всего чисел = 1, их количество:  " + b);
        } else if(c>a && c>b) {
            System.out.println("Больше всего чисел = 0, их количество:  " + c);
        }
    }
}
