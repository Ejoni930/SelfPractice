package day09Programming;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);

        System.out.println("Enter your first Number : \n");
        int num1=src.nextInt();

        System.out.println("Enter your second Number : \n");
        int num2=src.nextInt();

        System.out.println("Enter your third Number : \n");
        int num3=src.nextInt();

        if(num1<num2&&num1<num3){
            System.out.println(num1+" is the minimum number");
        }
        if(num2<num1&&num2<num3){
            System.out.println(num2+" is the minimum number");
        }
        if(num3<num1&&num3<num2){
            System.out.println(num3+" is the minimum number");
        }

    }
}

