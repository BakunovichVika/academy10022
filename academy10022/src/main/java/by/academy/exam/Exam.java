package by.academy.exam;

public class Exam <T extends Number >{

    protected T[] marks;
    protected static int number;

    public Exam() {
    }

    public Exam(T[] marks){
        this.marks=marks;
    }

    int index=0;

    public void addMarks (T exam) {
        if (index >= marks.length) {
            add ();
        }
        marks [index++] = exam;
    }

    public void add(){
            T[] newMarks = (T[]) new Number[marks.length * 2 +1];
            System.arraycopy(marks, 0, newMarks, 0, marks.length);
            marks = newMarks;
        }

    public double average() {
        double sum = 0.0;

        for (T value : marks) {
            sum += value.doubleValue();
        }

        return sum / marks.length;
    }
}
