package by.academy.homework4.task3;

public class IteratorMassiveDemo {
    public static void main(String[] args) {

        Integer[][] array = new Integer[][]{{1}, {2,3,4,5}, {6,7,8,9,10,11,12}};
        IteratorMassive i = new IteratorMassive(array);
        for (;i.hasNext();) {
            System.out.println(i.next());
        }
    }
}
