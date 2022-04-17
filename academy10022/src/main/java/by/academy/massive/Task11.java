package by.academy.massive;

import java.util.Scanner;

public class Task11 {
    public static void main (String[] args) {

        int n=0,summa1=0,summa2=0;
        int j;

        do {
            System.out.print("Введите четное число: ");
            Scanner sc = new Scanner(System.in);

            if(sc.hasNextInt()) {
                n = sc.nextInt();
                if(n>0&&n%2==0) {

                    int[] array = new int[n];

                    for(int i=0; i<array.length; i++) {
                        array[i] = (int)(Math.random()*12-6);
                        System.out.print(array[i]+" ");
                    }

                    j = array.length/2;
                    for(int i=0; i<j; i++) {
                        summa1 = summa1+Math.abs(array[i]);
                    }

                    for(int i=j; i<array.length; i++) {
                        summa2 = summa2+Math.abs(array[i]);
                    }
                    System.out.println();
                    if(summa1<summa2) {
                        System.out.println("Сумма модулей первой половины меньше");
                    } else if(summa1>summa2) {
                        System.out.println("Сумма модулей второй половины меньше");
                    } else {
                        System.out.println("Сумма модулей равна");
                    }
                }
            }
        }
        while(n<=0 || n%2!=0);
    }
}
