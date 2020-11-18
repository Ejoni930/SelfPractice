package day_15Programming;

import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter your height : ");
        double height= src.nextDouble();
        System.out.println("Enter your shoe size : ");
        byte shoeSize= src.nextByte();
        System.out.println("Enter your boolean value");
        boolean hat= src.nextBoolean();
        System.out.println("Height is : "+height);
        System.out.println("Shoe size is : "+shoeSize);
        if(hat){
            System.out.println("This is a nice hat . ");
        }else{
            System.out.println("Put your hat on :P ");
        }
    }
}
/*
- Ask the user to enter their height (double), shoe size (byte), and if they like to wear hats (boolean). Print out the information
 */