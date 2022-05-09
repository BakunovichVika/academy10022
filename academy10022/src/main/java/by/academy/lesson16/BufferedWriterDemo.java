package by.academy.lesson16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Java.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String lesson1 = "Введение в Java!";
            String lesson2 = "ООП в Java";
            String lesson3 = "Git";
            String lesson4 = "Scanner";
            String lesson5 = "Массивы";

            bufferedWriter.write(lesson1);
            bufferedWriter.newLine();
            bufferedWriter.write(lesson2);
            bufferedWriter.newLine();
            bufferedWriter.write(lesson3);
            bufferedWriter.newLine();
            bufferedWriter.write(lesson4);
            bufferedWriter.newLine();
            bufferedWriter.write(lesson5);
            bufferedWriter.newLine();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
