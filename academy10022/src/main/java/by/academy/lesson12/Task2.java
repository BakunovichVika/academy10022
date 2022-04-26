package by.academy.lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 extends HeavyBox {

    public Task2(int w, int h, int d, int m) {
        super(w, h, d, m);


    }

    public static void main (String[] args) {

        List<HeavyBox> list = new ArrayList<>();

        HeavyBox heavyBox1 = new HeavyBox(9,8,8,301);
        HeavyBox heavyBox2 = new HeavyBox(15,12,05,20);
        HeavyBox heavyBox3 = new HeavyBox(500,156,456,654);
        HeavyBox heavyBox4 = new HeavyBox(123,369,4,12);
        HeavyBox heavyBox5 = new HeavyBox(20,20,12,155);

        list.add(heavyBox1);
        list.add(heavyBox2);
        list.add(heavyBox3);
        list.add(heavyBox4);
        list.add(heavyBox5);


        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            if (heavyBox1.weight>300){
                System.out.println("Вес больше 300!");
            }
        }

    }
}
