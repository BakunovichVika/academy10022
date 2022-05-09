package by.academy.collection;

import java.util.*;

public class Task4 {
    public static void main(String [] args){
        SortedSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            int i = 0;

            @Override
            public int compare(String o1, String o2) {
                return i--;
            }
        });

        treeSet.add("Минск");
        treeSet.add("Брест");
        treeSet.add("Могилев");
        treeSet.add("Гродно");
        treeSet.add("Гомель");
        treeSet.add("Минск");

        System.out.println(treeSet);

		SortedSet<String> subSet = treeSet.subSet("Минск", "Могилев");
		System.out.println("SubSet: " + subSet);

		System.out.println("HeadSet: " + treeSet.headSet("Гомель"));
		System.out.println("TailSet: " + treeSet.tailSet("Гродно"));
		System.out.println("Первый элемент: " + treeSet.first());
		System.out.println("Последний элемент: " + treeSet.last());

    }
}
