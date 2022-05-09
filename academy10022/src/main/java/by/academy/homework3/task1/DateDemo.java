package by.academy.homework3.task1;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateDemo {

     public static void main (String[] args) throws ParseException {

//           System.out.println("Введите дату");
//           Scanner sc = new Scanner(System.in);
//           String date= sc.nextLine();
//
//           DateTask day = new DateTask();
//           day.dayOfMonth(date);

           DateTask day1 = new DateTask("26-12-2001");

           Calendar day = new GregorianCalendar(2017,0,25);
           Date day2 = day.getTime();
           System.out.println(day2);
           Date day3 = new Date();
           day3.getTime();
           System.out.println(day3);
           System.out.println("Количество дней между датами: "+ DateTask.dayBetween(day3,day2));

           DateTask day4 = new DateTask(2024,12,26);
           day4.isLeapYear();
        }
//        String input_date="03/05/2022";
//        SimpleDateFormat pattern=new SimpleDateFormat("dd/MM/yyyy");
//        DateTask dt1=pattern.parse(input_date);
//        DateFormat pattern2=new SimpleDateFormat("EEEE");
//        String finalDay=pattern2.format(dt1);
//        System.out.println(finalDay);

//        public int nDaysBetweenTwoDate(String String firstString;
//        firstString, String String secondString) {
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//            DateTask firstDate = 2001-12-20;
//            DateTask secondDate = null;
//            try {
//                firstDate = df.parse(firstString);
//                secondDate = df.parse(secondString);
//            } catch (Exception e) {
//                // Ошибка формата строки даты
//                System.out.println ("Ошибка формата строки даты");
//            }
//            int nDay = (int) ((secondDate.getTime() - firstDate.getTime()) / (24 * 60 * 60 * 1000));
//            return nDay;
        }
//    }
//}
