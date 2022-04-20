package by.academy.cycle;

public class Task13 {

    public static void main (String [] args) {

        int x = 0;
        for (int i=100; i<200; i++) {
            if (i%17==0) {
                x+=i;
            }
        }
        System.out.println(x);
    }
}
