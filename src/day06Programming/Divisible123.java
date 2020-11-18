package day06Programming;

public class Divisible123 {
    public static void main(String[] args) {
        int number =65;
        boolean isDivisibleByTwo=number%2==0;
        boolean isDivisibleByThree=number%3==0;
        boolean isDivisibleByFive=number%5==0;
        System.out.println(number+" is divisible by 2:"+isDivisibleByTwo);
        System.out.println(number+" is divisible by 3:"+isDivisibleByThree);
        System.out.println(number+" is divisible by 5:"+isDivisibleByFive);
        System.out.println("=======================================================================");
        int number1=80;
        if(number1%2==0){
            System.out.println(number1+" divisible by two : true");
        }else{
            System.out.println(number1+" divisible by two : false");
        }
        if(number1%3==0){
            System.out.println(number1+" divisible by two : true");
        }else{
            System.out.println(number1+" divisible by two : false");
        }
        if(number1%5==0){
            System.out.println(number1+" divisible by two : true");
        }else{
            System.out.println(number+" divisible by two : false");
        }
    }
}
