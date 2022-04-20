package by.academy.cycle;

public class Task12 {

    public static void main (String [] args) {

        int x = 1;
        for (int i=10; i<100; i++) {
            if (i%2==1 & i%13==0) {
                x*=i;
            }
        }
        System.out.println(x);
    }
}
