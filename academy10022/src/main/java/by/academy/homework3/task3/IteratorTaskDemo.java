package by.academy.homework3.task3;

public class IteratorTaskDemo {
    public static void main(String[] args) {

        Integer[] array = {1,2,3,4,5};

        CollectionForIterator<Integer> arrayIterator = new CollectionForIterator<>(array);

        IteratorTask iterator = arrayIterator.getIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
