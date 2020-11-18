package day_13Programming;

public class Threenumbers1 {
    public static void main(String[] args) {
        int num1=20;
        int num2=10;
        int num3=30;
        boolean value=false;
        int sum=0;

        if (num1%2==0){
            num1*=5;
        }else{
            num1*=10;
        }
        System.out.println(num1);
        if(num3%5==0){
            num3/=5;
        }else{
            num3/=2;
        }
        System.out.println(num3);

        if (value==true){
            sum=num1+num2+num3;
        }
        if(sum%10==0){
            System.out.println("Number is divisible by 10 .");
        }else{
            System.out.println("Invalid number");
        }
        if (value==false){
            sum=num1*num2*num3;
        }
        if(sum%2!=0){
            System.out.println("Number is odd");
        }else{
            System.out.println("Invalid result");
        }

    }
}
