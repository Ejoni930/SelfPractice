package day01Programming;
import java.util.Scanner;
import java.lang.String;
public class Twoinputnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1=in.nextInt();
        System.out.println("Input second number: ");
        int num2=in.nextInt();
        System.out.println(num1 +"x" + num2 +  "="  + (num1 * num2));
        System.out.println(num1 +"x" + num2 +  "="  + (num1 / num2));
        System.out.println(num1 +"x" + num2 +  "="  + (num1 + num2));
        System.out.println(num1 +"x" + num2 +  "="  + (num1 - num2));
        System.out.println(num1 +"x" + num2 +  "="  + (num1 % num2));


    }
}
