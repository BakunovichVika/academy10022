package by.academy.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("4");
        hashSet.add("5");

        System.out.println(hashSet);
    }
}
