package day_15Programming;

import java.util.Scanner;

public class Multiplying {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int mum1= src.nextInt();
        System.out.println("Enter your second number : ");
        int num2= src.nextInt();
        int total=mum1*num2;
        System.out.println(mum1+" * "+num2+" = "+total );
    }
}
/*
 Create a program that will take two int numbers and multiply them. Print in the following way:
    %numOne x %numTwo = %result
    Ex: 3,5 --> 3 x 5 = 15
    Ex: -2,30 --> -2 x 30 = -60

 */