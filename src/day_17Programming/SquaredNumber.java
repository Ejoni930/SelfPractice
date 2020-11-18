package day_17Programming;

import java.util.Scanner;

public class SquaredNumber {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        System.out.println("Enter the number:");
         int result=0;
        int n1= src.nextInt();
        for (int i=1;i<=n1;i++){
          result=i*i;
            System.out.println(i+" * "+i+" = "+result);
        }

    }
}
