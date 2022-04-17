package by.academy.massive;

public class Task17 {
    public static void main(String[] args) {

        int[][] array = new int[6][7];
        int max;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++) {
                array[i][j] = (int)(Math.random()*10);
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i=0; i<array.length; i++) {
            for(int j=array[i].length-1; j>0; j--) {
                if(array[i][j]>array[i][j-1]) {
                    max = array[i][j];
                    array[i][j] = array[i][j-1];
                    array[i][j-1] = max;
                }
            }

        }
        System.out.println("Преобразованный массив: ");

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

