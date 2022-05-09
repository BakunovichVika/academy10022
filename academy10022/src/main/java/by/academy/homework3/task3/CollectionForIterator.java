package by.academy.homework3.task3;

import java.util.Arrays;

public class CollectionForIterator<T> {
    protected T[] array;

    public CollectionForIterator(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "CollectionForIterator{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public IteratorTask getIterator() {
        return new CollectionIterator();
    }

    protected class CollectionIterator implements IteratorTask {

        int index;

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
