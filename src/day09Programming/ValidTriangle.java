package day09Programming;


import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter first angle value : ");
        int angle1=src.nextInt();
        System.out.println("Enter second angle value : ");
        int angle2=src.nextInt();
        System.out.println("Enter third angle value : ");
        int angle3=src.nextInt();

        if(angle1+angle2+angle3==180){
            System.out.println("Triangle is valid");
        }
        if(angle1+angle2+angle3!=180){
            System.out.println("Triangle is not valid");
        }
    }
}
/*
Task02: ValidTriangle
         A triangle is valid if the sum of all the three angles is equal to 180 degrees.
         Write a program that declares three integers as
         angles and check whether a triangle is valid or not
 */