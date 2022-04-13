package by.academy.lesson10;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2019,5,26);
        System.out.println("Начальная дата: " + date1);

        LocalDate plusYears = date1.plusYears(5);
        LocalDate minusMonths = date1.minusMonths(3);
        LocalDate plusDays = date1.plusDays(45);

        System.out.println("plusYears: " + plusYears);
        System.out.println("minusMonths: " + minusMonths);
        System.out.println("plusDays: " + plusDays);

        boolean afterYears = date1.isAfter(plusYears);
        boolean afterMonths = date1.isAfter(minusMonths);
        boolean afterDays = date1.isAfter(plusDays);

        boolean beforeYears = date1.isBefore(plusYears);
        boolean beforeMonths = date1.isBefore(minusMonths);
        boolean beforeDays = date1.isBefore(plusDays);

        boolean equalsYears = date1.equals(plusYears);
        boolean equalsMonths = date1.equals(minusMonths);
        boolean equalsDays = date1.equals(plusDays);

        System.out.println(afterYears + " " + afterMonths + " " + afterDays);
        System.out.println(beforeYears + " " + beforeMonths + " " + beforeDays);
        System.out.println(equalsYears + " " + equalsMonths + " " + equalsDays);
    }
}