package by.academy.massive;

public class Task14 {
    public static void main(String[] args) {
        int[][] array = new int[5][8];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++) {
                array[i][j] = (int)(Math.random()*90+10);
            }
        }

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
