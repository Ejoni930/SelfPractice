package day_18Programming;

import java.util.Scanner;

public class Arrays {
    static Scanner src =new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers=myArray(10);
        for (int i=0;i<myIntegers.length;i++) {
            System.out.println("Element " + i + "value is :"+myIntegers[i]);
        }
    }
    public static int [] myArray(int number){
        System.out.println("Enter "+number+" integer values");
        int[] value= new int [number];
        for (int i=0;i<value.length;i++){
            value[i]=src.nextInt();
        }
        return value;
    }
}
