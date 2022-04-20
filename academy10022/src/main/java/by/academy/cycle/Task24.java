package by.academy.cycle;

public class Task24 {

    public static void main(String[] args) {

        int a = 1;
        double b = 1;

        for (int i = 2;i < 10; i++) {
            a += i;
            System.out.print(a + " ");
            b *= (double) a;
        }
        System.out.println();
        System.out.println(b);
    }

}
