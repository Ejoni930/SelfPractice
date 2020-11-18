package day_18Programming;

import java.util.Scanner;

public class Arrays2 {
    static Scanner src =new Scanner(System.in);

    public static void main(String[] args) {
        int [] myIntegers = myArray(10);
        for (int i=0;i<myIntegers.length;i++) {
            System.out.println("The element of" + i + " is " + myIntegers[i]);
        }
    }
    public static int[]myArray(int number){
        int []value=new int[number];
        System.out.println("Enter "+number+" integer value");
        for(int i=value.length;i<=0;i--){
            value[i]=src.nextInt();
        }
        return value;
    }
}
