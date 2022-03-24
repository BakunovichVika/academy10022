package by.academy.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegesDemo {
    public static void main(String[] args) {
//        System.out.println(test("google.com"));
//        System.out.println(test("reference1.by"));
//        System.out.println(test("reference1.org"));
//    public static boolean test(String testString) {
//        Pattern pattern = Pattern.compile(".+\\.(com|by|org)");
//        Matcher matcher = pattern.matcher(testString);
//        return matcher.matches();
        Pattern pattern = Pattern.compile("Java\\s\\d+");

        String text = "Versions: Java  5, Java 6, Java    7, Java 12.";

        Matcher matcher = pattern.matcher(text);
        Matcher m = pattern.matcher(text);

        while (m.find()) {
            int start = m.start();
            int end = m.end();
            System.out.println(text.substring(start, end));
        }
        System.out.println(text.replaceAll("\\s+", " "));
    }
}
