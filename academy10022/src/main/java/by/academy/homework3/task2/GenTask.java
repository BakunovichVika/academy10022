package by.academy.homework3.task2;

import java.util.Arrays;

public class GenTask <T> {
    protected T[] array;
    protected int index;

    public GenTask(T[] array, int index) {
        this.array = array;
        this.index = index;
    }

    public GenTask(){
        this.array=(T[]) new Object[16];
    }

    public GenTask(int length){
        this.array=(T[]) new Object[length];
    }

    public void add(T obj){
        if (index>=array.length){
            T[] arrays = (T[]) new Object[array.length * 2 + 1];
            System.arraycopy(array, 0, arrays, 0, array.length);
            this.array = arrays;
        }
        else array[index++] = obj;
    }

    public T get(int i){
        if (i>=array.length||i<0){
            System.out.println("Такого элемента не существует в массиве");
        }
        return array[i];
    }

    public T getLast(){
        return array[index-1];
    }

    public T getFirst(){
        return array[0];
    }

    public int length(){
        return index;
    }

    public int lastIndex() {
        return index - 1;
    }

    public void remove(int i){
        if (i < array.length && i >= 0) {
            System.arraycopy(array, i + 1, array, i, array.length - i - 1);
            index--;
        }
    }

    public void removeObject(T obj){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(obj)) {
                System.arraycopy(array, i + 1, array, i, array.length - i - 1);
                index--;
                break;
            }
        }
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "GenTask{" +
                "array=" + Arrays.toString(array) +
                ", index=" + index +
                '}';
    }
}
