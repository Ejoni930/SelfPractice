package Time;

import java.util.Scanner;

public class Watch {
    private int day;
    public int month;
    public int year;
    public int dayOfTheWeek;
Scanner src=new Scanner(System.in);

    public Watch(int day, int month, int year, int dayOfTheWeek) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        System.out.println("Enter day");
        day= src.nextInt();
        System.out.println("Day is "+day);
        this.day = day;
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        System.out.println("Enter month");
        month=src.nextInt();
        String monthName = " ";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Month does not exist ";

        }
        System.out.println("Month is : " + monthName);
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        System.out.println("Enter year ");
        year=src.nextInt();
        this.year = year;
        System.out.println("Year is "+year);
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(int dayOfTheWeek) {
        System.out.println("Enter week day ");
        dayOfTheWeek= src.nextInt();
        String dayName = " ";
        switch (dayOfTheWeek) {

            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "There is no such a day";
        }
        System.out.println("Day is "+dayName);
        this.dayOfTheWeek = dayOfTheWeek;
    }


}
