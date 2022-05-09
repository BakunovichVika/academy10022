package by.academy.homework3.task2;

public class GenTaskDemo {
    public static void main(String[] args){

        GenTask<Integer> genArray = new GenTask<>();
        genArray.add(15);
        genArray.add(20);
        genArray.add(10);
        genArray.add(11);
        genArray.add(12);
        genArray.add(14);

        System.out.println("Массив: " + genArray);

        genArray.remove(1);
        System.out.println("Массив после удаления элемента по индексу: "+genArray);
        genArray.removeObject(10);
        System.out.println("Массив после удаления элемента по значению: "+genArray);


        System.out.println("Последний элемент массива: "+genArray.getLast());
        System.out.println("Первый элемент массива: "+genArray.getFirst());
        System.out.println("Размерность массива: "+genArray.length());
        System.out.println("Индекс последнего заполненного элемента: "+genArray.lastIndex());

    }
}
