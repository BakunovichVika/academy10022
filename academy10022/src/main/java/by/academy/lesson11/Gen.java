package by.academy.lesson11;

import by.academy.lesson1.Cat;

import java.awt.print.Book;
import java.io.Serializable;

public class Gen <T extends Comparable,V extends Cat & Serializable, K extends Number> {


    private T t;
    private V v;
    private K k;

    public Gen (T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

//    public Gen(String кот, int i, double v) {
//    }

//    Gen <T,V,K> gen1 = new Gen<T, V, K> ("Кот", 15, 2020.0);


    public void cat1 () {

        Cat cat = new Cat();
        Gen <String, Cat, Double> gen1 = new Gen<> ("Кот", cat, 2020.0);
        System.out.println(t + " " + v + " " + k);

    }

    public static void main (String[] args) {
        Cat cat = new Cat(15);
        Gen <String, Cat, Double> gen1 = new Gen<> ("Кот", cat, 2020.0);

        gen1.cat1();
    }

}
