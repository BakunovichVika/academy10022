package by.academy.lesson14;

import java.util.HashMap;
import java.util.Map;

public class ToyDemo {

    public static void main (String[] args){


        Map<String, Toy> map1 = new HashMap<>();

        Toy t1 = new Toy();
        Toy t2 = new Toy();
        Toy t3 = new Toy();

        map1.put("Васька", t1);
        map1.put("Гена", t2);
        map1.put("Диана", t3);

        printKey((HashMap<String, Toy>) map1);
        printValue((HashMap<String, Toy>) map1);
        printValueAndEntry((HashMap<String, Toy>) map1);
    }

    public static void printKey (HashMap<String,Toy> map1){
        for (String key : map1.keySet()) {
            System.out.println(key);
        }
    }

    public static void printValue (HashMap<String,Toy> map1){
        for (Toy value : map1.values()) {
            System.out.println(value);
        }
    }

    public static void printValueAndEntry (HashMap<String,Toy> map1){
        for (Map.Entry<String, Toy> entry : map1.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }

}
