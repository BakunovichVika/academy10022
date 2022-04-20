package by.academy.cycle;

public class Task10 {

    public static void main (String [] args) {


        int n=0;

        for (int i=1; i<50; i++) {

            if (i%5==0 & i%7==0) {
                n += i;
            }

            else if (i%5==0 & i%7!=0) {
                n += i;
            }

            else if (i%5!=0 & i%7==0) {
                n += i;
            }
        }
        System.out.println(n);
    }
}
