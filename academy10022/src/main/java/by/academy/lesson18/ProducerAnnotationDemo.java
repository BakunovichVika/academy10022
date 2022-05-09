package by.academy.lesson18;

import by.academy.lesson12.Producer;
import by.academy.shop.Juice;

import java.lang.reflect.Method;

public class ProducerAnnotationDemo {
    public static void main(String[] args) throws NoSuchMethodException {

        Juice rich = new Juice(2.5, 10, "Рич", "Без мякоти", "Ананасовый");
        Class<Juice> clazz = Juice.class;

        Method m = clazz.getDeclaredMethod("getDiscount");
        Producer annotation = clazz.getAnnotation(Producer.class);

        System.out.println(annotation.founderFullName());

    }
}
