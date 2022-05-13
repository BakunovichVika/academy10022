package by.academy.homework4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {

    static int n = 1000000;
    static ArrayList<Integer> listArray = new ArrayList<>();
    static LinkedList<Integer> listLinked = new LinkedList<>();

    public static void main(String[] args) {

        addRandom(listArray,listLinked);
        System.out.println(listArray);
        System.out.println(listLinked);

        long listArrayStart = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                listArray.get((int)Math.random());
            }
        long listArrayEnd = System.currentTimeMillis();
            System.out.println(listArrayEnd-listArrayStart);

        long listLenkedStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
                listArray.get((int)Math.random());
            }
        long listLinkedEnd = System.currentTimeMillis();
        System.out.println(listLinkedEnd-listLenkedStart);

    }

    public static void addRandom(ArrayList listArray, LinkedList listLinked) {
        for (int i = 0; i < n; i++) {
            listArray.add(Math.random()*9+1);//числа больше 1 и меньше 10
        }
        for (int i = 0; i < n; i++) {
            listLinked.add(Math.random()*9+1);
        }

    }

}
