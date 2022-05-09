package by.academy.homework3.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static Pattern patternDate = Pattern.compile("^\\d{2}[\\-\\-]\\d{2}[\\-\\-]\\d{4}");

    public static boolean checkDate (String date) {
        Matcher matcher = patternDate.matcher(date);
        return matcher.matches();
    }
}
