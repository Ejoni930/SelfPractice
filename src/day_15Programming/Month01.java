package day_15Programming;

import java.util.Scanner;

public class Month01 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter year : ");
        int year= src.nextInt();
        System.out.println("Enter month number : ");
        int number= src.nextInt();
        String monthName=" ";
        if (number<=12&&number>0) {
            if (number == 1) {
                monthName = "January and it has 31 days!";
            } else if (number == 2) {
                if (year % 4 == 0) {
                    monthName = "February and it has 29 days!";
                } else {
                    monthName = "February and it has 28 days!";
                }

            } else if (number == 3) {
                monthName = "March and it has 31 days!";
            } else if (number == 4) {
                monthName = "April and it has 30 days!";
            } else if (number == 5) {
                monthName = "May and it has 31 days!";
            } else if (number == 6) {
                monthName = "June and it has 30 days!";
            } else if (number == 7) {
                monthName = "July and it has 31 days!";
            } else if (number == 8) {
                monthName = "August and it has 31 days!";
            } else if (number == 9) {
                monthName = "September and it has 30 days!";
            } else if (number == 10) {
                monthName = "October and it has 31 days!";
            } else if (number == 11) {
                monthName = "November and it has 30 days!";
            } else {
                monthName = "December and it has 31 days!";
            }
        }else {
            monthName="Year only has 12 months!";
        }
        System.out.println("Year is  "+year);
        System.out.println("Month is  "+monthName);
    }
}



