package day_13Programming;



import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {

        Scanner src=new Scanner(System.in);
        System.out.println("Enter your first number ");
        int num1= src.nextInt();
        if (num1%2==0){
            num1*=5;
        }else{
            num1*=10;
        }


        System.out.println("Enter your second  number ");
        int num2= src.nextInt();
        System.out.println("Enter your third  number ");
        int num3= src.nextInt();
        if(num3%5==0){
            num3/=5;
        }else{
            num3/=2;
        }

        System.out.println("Enter your boolean  value ");
        boolean value= src.nextBoolean();
        if (value){
            System.out.println(num1+num2+num3);
        }
        if((num1+num2+num3)%10==0){
            System.out.println("Number is divisible by 10 .");
        }else{
            System.out.println("Invalid number");
        }
        if (!value){
            System.out.println(num1*num2*num3);
        }
        if((num1*num2*num3)%2!=0){
            System.out.println("Number is odd");
        }else{
            System.out.println("Invalid result");
        }

    }
}
