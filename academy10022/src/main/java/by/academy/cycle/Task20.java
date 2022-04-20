package by.academy.cycle;

public class Task20 {
    public static void main (String[] args) {

        int a=0,b=0;
        for (int n = 10; n < 100; n++) {
            for (int s = 10; s < 100; s++) {
                a = n * 100 + s;
                b = s * 100 + n;
                if (a % 99 == 0 & b % 49 == 0) {
                    System.out.println(a);
                    System.out.println(b);
                }
            }
        }
    }
}
