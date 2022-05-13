package by.academy.homework4;

public class Task6 {
    public static void main(String[] args){

        int[] massive = new int[8];

        try {
            for (int i = 0; i < 11; i++) {
                massive[i] = (int) Math.random();
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is to small, expand the array");
        }

    }
}
