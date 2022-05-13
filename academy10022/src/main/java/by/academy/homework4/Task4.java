package by.academy.homework4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 implements Iterator<Integer> {
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>();
        int max=0;

        for (int i = 0; i<5;i++){
           marks.add((int) (Math.random()*10+1));
        }
        System.out.println(marks);

        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()){
            int a = iterator.next();
            if (a>max){
                max=a;
            }
        }
        System.out.println(max);
        }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }
}
