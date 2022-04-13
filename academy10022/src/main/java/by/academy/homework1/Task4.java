package by.academy.homework1;

public class Task4 {
    public static void main (String[] args) {

        int i = 2;
        int a = 1;
        int itog;
        do {
            itog = (int) Math.pow(i,a);
            a++;
            System.out.println(itog);
        }
        while (itog<1_000_000);
    }
}
