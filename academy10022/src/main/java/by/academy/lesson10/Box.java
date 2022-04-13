package by.academy.lesson10;

public class Box <T> {

    private T[] items;

    public Box(T[] items) {
        this.items = (T[]) new Object[10];
    }

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }
}
