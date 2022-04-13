package by.academy.massive;

public class Task5 {
    public static void main(String[] args) {

//        int array1[] = new int[5];
//        int array2[] = new int[5];
//        int a, b;
//
//        for (a = 0; a < 5; a++) {
//            array1[a] = (int) (Math.random() * 6);
//        }
//
//        for (b = 0; b < 5; b++) {
//            array2[b] = (int) (Math.random() * 6);
//        }
//
//        for (int c : array1) {
//            System.out.print(c + " ");
//        }
//
//        System.out.println();
//
//        for (int d : array2) {
//            System.out.print(d + " ");
//        }
//
//        int sum1,sum2 = 0;
//        for(int a=0; a<array1.length; a++){
//            sum1 = sum1+array1[a];
//        }
//        for(int i=0; i<mas2.length; i++){
//            s2 = s2+mas2[i];
//        }
//        System.out.println();
//        a1 = (double)s1/5;
//        a2 = (double)s2/5;

//        int sum = 0;
//        sum += array1[a];
//        System.out.println(sum/5);
//
        int[] array1 = new int[5], array2 = new int[5];
        int sum1, sum2;
        double a1, a2;
        sum1 = 0;
        sum2 = 0;

        for(int i=0; i<array1.length; i++){
            array1[i] = (int)(Math.random()*6);
            array2[i] = (int)(Math.random()*6);
        }
        for(int i=0; i<array1.length; i++) {
            System.out.print(array1[i]+" ");
        }

        System.out.println();

        for(int i=0; i<array2.length; i++) {
            System.out.print(array2[i]+" ");
        }


        for(int i=0; i<array1.length; i++){
            sum1 += array1[i];
        }

        for(int i=0; i<array2.length; i++){
            sum2 += array2[i];
        }

        System.out.println();


        a1 = (double)sum1/5;
        a2 = (double)sum2/5;


        if(a1<a2) {
            System.out.println("Srednee arifmeticheskoje pervogo massiva menjshe srednego arifmethicheskogo vtorogo massiva");
        } else if(a2<a1) {
            System.out.println("Srednee arifmeticheskoje vtorogo massiva menjshe srednego arifmethicheskogo pervogo massiva");
        } else {
            System.out.println("Srednije arifmethicheskije ravni drug drugu");
        }
    }
}

