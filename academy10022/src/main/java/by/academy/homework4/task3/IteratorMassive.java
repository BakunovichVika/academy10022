package by.academy.homework4.task3;

import java.util.Iterator;

public class IteratorMassive implements Iterator<Integer> {

    private Integer[][] massive;
    private int i, j;

    public IteratorMassive(Integer[][] massive) {
        this.massive = massive;
    }

    @Override
    public boolean hasNext() {
        return i < massive.length && j < massive[i].length;
    }

    @Override
    public Integer next() {
        Integer a = massive[i][j++];
        if (j >= massive[i].length) {
            i++;
            j = 0;
        }
        return a;
    }
}
