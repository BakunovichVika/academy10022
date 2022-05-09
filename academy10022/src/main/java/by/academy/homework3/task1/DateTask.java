package by.academy.homework3.task1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTask {
        protected Year year;
        protected Month month;
        protected Day day;

        protected DateTask(){
            super();
        }

        protected DateTask(int year,String month,int day){
            super();
        }

        protected DateTask(int year,int month,int day){
            this.year = new by.academy.homework3.task1.DateTask.Year(year);
            this.month = new by.academy.homework3.task1.DateTask.Month(month);
            this.day = new by.academy.homework3.task1.DateTask.Day(day);    }


        protected DateTask (String patternDay) {
            super();
            if (Validator.checkDate(patternDay)) {
                System.out.println("Дата:"+patternDay);
                System.out.println("Дата соответствует формату:)");
            } else {
                System.out.println("Дата:"+patternDay);
                System.out.println("Введите дату в формате dd-mm-yyyy");
            }
        }

        public void dayOfMonth(String date) throws ParseException {
            SimpleDateFormat pattern1=new SimpleDateFormat("dd/MM/yyyy");
            Date date1=pattern1.parse(String.valueOf(date));
            DateFormat pattern2=new SimpleDateFormat("EEEE");
            String finalDate=pattern2.format(date1);
            System.out.println(finalDate);
        }

        public static int dayBetween(Date day2, Date day3){
            return (int)( (day2.getTime() - day3.getTime()) / (1000 * 60 * 60 * 24));
        }

        public void isLeapYear(){
            if (year.getYear() % 400==0){
                System.out.println("Год високосный");
            }
            else System.out.println("Год не является високосным");
        }


        private class Year {
            private int year;

            private Year(int i) {
                super();
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            @Override
            public String toString() {
                return "Year{" +
                        "year=" + year +
                        '}';
            }
        }

        private class Month {
            private String month;

            private Month(int i) {
                super();
            }

            public String getMonth() {
                return month;
            }

            public void setMonth(String month) {
                this.month = month;
            }

            @Override
            public String toString() {
                return "Month{" +
                        "month='" + month + '\'' +
                        '}';
            }
        }

        private class Day {
            private int day;

            private Day(int i) {
                super();
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            @Override
            public String toString() {
                return "Day{" +
                        "day=" + day +
                        '}';
            }
        }

    @Override
    public String toString() {
        return "DateTask{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
