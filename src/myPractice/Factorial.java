package myPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i=1, number;
      long factorial=1;
        Scanner src=new Scanner(System.in);

        System.out.println("Enter the number :");

      /* for( i=1;i<=number;i++){
           factorial=factorial*i;

            }
        System.out.format("\nFactorial of %d = %d\n",number,factorial);
*/
          for (number= src.nextInt();number>i;number--){
              factorial=factorial*number;
          }
        System.out.println("Factorial of "+number+" is "+factorial);
    }
}
/*
ex = 1 + x +  x2/2!  +  x3/3!  +  x4/4!  +  x5/5!
 */