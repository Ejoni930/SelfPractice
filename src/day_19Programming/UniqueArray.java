package day_19Programming;

import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter length");
        int length= src.nextInt();
        int []numbers=new int[length];
        System.out.println("Enter "+length+" integers numbers.");
        for (int i=0;i<length;i++){
            numbers[i]= src.nextInt();
        }

        for (int i=0;i<length;i++){
            int count=0;
            int each=numbers[i];
            for (int j=0;j<length;j++){
                if(each==numbers[j]){
                    count++;
                }

            }
            if (count==1){
                System.out.println("Unique number is: "+numbers[i]);
            }

            if(count>1){
                System.out.println("Duplicate number is: "+numbers[i]);
            }
        }

    }
}
/*
 1. write a program that can find the unique numbers from an integer array
 */