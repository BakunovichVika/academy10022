package by.academy.shop;

import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Regex {

        public static Pattern patterndate = Pattern.compile("^\\d{1,2}[\\/\\-]\\d{1,2}[\\/\\-]\\d{4}$");
        public static Pattern patternAmerican = Pattern.compile("^\\+\1\\d+$");
        public static Pattern patternBelarus = Pattern.compile("^\\+\375\\d+$");
        public static Pattern patternEmail = Pattern.compile("^([a-z0-9]+\\.)*[a-z0-9]+@[a-z0-9]+(\\.[a-z0-9]+)*\\.[a-z]{2,6}$");



    public static boolean checkdate (String date) {
            Matcher matcher = patterndate.matcher(date);
            return matcher.matches();
        }

    public static boolean checkAmerican (String valid) {
        Matcher matcher = patternAmerican.matcher(valid);
        return matcher.matches();
    }

    public static boolean checkBelarus (String valid) {
        Matcher matcher = patternBelarus.matcher(valid);
        return matcher.matches();
    }

    public static boolean checkEmail (String valid) {
        Matcher matcher = patternEmail.matcher(valid);
        return matcher.matches();
    }



}
