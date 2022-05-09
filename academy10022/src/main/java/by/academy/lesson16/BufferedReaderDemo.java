package by.academy.lesson16;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("Java.txt");
                BufferedReader bufferedReader = new BufferedReader(reader)) {
            String str = null;
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
