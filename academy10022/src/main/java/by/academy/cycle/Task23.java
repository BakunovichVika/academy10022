package by.academy.cycle;

public class Task23 {
    public static void main(String[] args) {


        int a = 0, sum = 0;
        for (int i = 1; i <= 10; i++) {
            a = (int) Math.pow(2, i);
            System.out.print(a + " ");
            sum += a;
        }
        System.out.println();
        System.out.println("Сумма = " + sum);
    }
}
