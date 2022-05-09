package by.academy.lesson17;

import by.academy.lesson1.Cat;

import java.lang.reflect.Field;

public class ReflectionDemo {
    public static void main(String[] args){
        Cat vaska = new Cat(15, "Васька", "особенности");
        Class<Cat> catClass = Cat.class;

        Tiger petka = new Tiger("рыжий", 2, "Минск");
        Class<Tiger> tigerClass = Tiger.class;

        try {
            Field catField = catClass.getDeclaredField("age");
            Field catField1 = catClass.getDeclaredField("nickname");
            Field catField2 = catClass.getDeclaredField("peculiarities");
            catField.setAccessible(true);
            catField1.setAccessible(true);
            catField2.setAccessible(true);

            System.out.println(catField.get(vaska));
            System.out.println(catField1.get(vaska));
            System.out.println(catField2.get(vaska));

            Field tigerField = tigerClass.getDeclaredField("color");
            Field tigerField1 = tigerClass.getDeclaredField("friend");
            Field tigerField2 = tigerClass.getDeclaredField("home");
            tigerField.setAccessible(true);
            tigerField1.setAccessible(true);
            tigerField2.setAccessible(true);

            System.out.println();

            System.out.println(tigerField.get(petka));
            System.out.println(tigerField1.get(petka));
            System.out.println(tigerField2.get(petka));

            

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
