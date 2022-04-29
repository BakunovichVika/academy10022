package by.academy.lesson15;

import by.academy.lesson1.Cat;

public class CatExceptionDemo {
    public static void main(String[] args) throws CatException {
        Cat cat = new Cat(130, "Петька");
        try {
            сatThrowException(cat);
            System.out.println("Кот живой");
        } catch (CatException e) {
            System.out.println("Кот не очень живой"+e.getMessage());
        }
        System.out.println("лалала");
    }

    public static void сatThrowException(Cat cat) throws CatException {
        if (cat.getAge() > 30) {
            throw new CatException(cat.getAge(), "Коты столько не живут");
        }
        System.out.println("Вашему коту " + cat.getAge() + " лет.");
    }
}
