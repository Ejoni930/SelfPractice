package day_15Programming;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the month : ");
        int month = src.nextInt();
        System.out.println("Enter the day : ");
        int day = src.nextInt();
        System.out.println();
        System.out.println("Enter the year : ");
        int year = src.nextInt();
        System.out.println("I was born in : "+month+" / "+day+" / "+year);
    }
}
/*
- Ask the user to enter the year, month number, and day (pick any datatype for the values) they were born and print in the following format:
    " $month / $day / $year is your birthday "

 */