package by.academy.lesson15;

import java.io.*;

public class CatTextDemo {

    public static void main (String[] args){

        try (OutputStream output = new FileOutputStream("cat1.txt");
        InputStream input = new FileInputStream("cat1.txt")){
            char[] symbols ={'2', 'a', 'f'};
            for (int i =0; i<symbols.length;i++){
                output.write(symbols[i]);
            }

            int size = input.available();
            for (int i=0; i<size;i++){
                System.out.print((char) input.read()+" ");
            }
        } catch (IOException e) {
        System.out.print("Exception");
        }



    }
}
