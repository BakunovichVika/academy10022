package by.academy.homework1.lesson11;

public class BoxNumber <T extends Number> {

    private T[] array;

    public BoxNumber(T[] array) {
        this.array = array;
    }

    public double average() {
        double sum = 0.0;

        for (T value : array) {
            sum += value.doubleValue();
        }
        return sum / array.length;
    }

    public void maximum() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i<array.length; i++) {
            if (array[i].doubleValue() > max) {
                max = array[i].doubleValue();
            }
        }
    }

    public void minimum() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i<array.length; i++) {
            if (array[i].doubleValue() < min) {
                min = array[i].doubleValue();
            }
        }
    }
}
