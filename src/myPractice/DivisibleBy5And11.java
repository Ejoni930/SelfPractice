package myPractice;

import java.util.Scanner;

public class DivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter your number please");
        int number = src.nextInt();
        if (number%5==0&&number%11==0){
            System.out.println("The number you entered is divisible by 5 and 11 ");
        }else {
            System.out.println("The number you entered is not divisible by 5 and 11 ");
        }
    }
}
/*
 Write a program to check whether a number is divisible by 5 and 11 or not.

 */