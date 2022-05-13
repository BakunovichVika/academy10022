package by.academy.homework4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Task1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(5);
        System.out.println(list);
        System.out.println(withoutDuplicates(list));
    }

    public static HashSet withoutDuplicates(ArrayList list){
        return new HashSet(list);
    }
}
