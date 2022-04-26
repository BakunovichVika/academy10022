package by.academy.exam;

public class ExamDemo {

    public static void main(String[] args) {

        int number = (int) Math.random();;
        Double[] arr = new Double[0];

        for (int i=0; i<number;i++) {
            arr[i] = Math.random()*10;
        }

        for (double b : arr) {
            System.out.print(b + " ");
        }
        System.out.println(arr);

        Exam <Double> exam = new Exam<>(arr);
        exam.add();

    }


//        for (int i = 0; i < 10; i++) {
//            marks[i] = (int) (Math.random() * 10);
//        }
//
//        for (int j=0;j<=n;j++){
//            for (int i = 0; i < 10; i++) {
//                marks[i] = (int) (Math.random() * 10);
//            }
//        }
//        System.out.println(marks);
//
//    }
}
