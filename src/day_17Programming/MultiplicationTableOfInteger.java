package day_17Programming;

import java.util.Scanner;

public class MultiplicationTableOfInteger {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        System.out.println("Enter the  number you want to multiply: ");
        int num1= src.nextInt();
        System.out.println("Enter tha maximum number you want number one be multiplied with");
        int num2= src.nextInt();
        int result=1;
        for (int i=1;i<=num2;i++){
            result=i*num1;
            System.out.println(num1+" * "+i+" = "+result);
        }
    }
}
