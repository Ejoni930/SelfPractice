package myPractice;


import java.util.Scanner;

public class Savings {
    public static void main(String[] args)  {


    double total=computeAmountDue(5,10,2);
        System.out.println(total);
    }





    public static double computeAmountDue(double price) {
        double tax = price * 12 / 100;
        double total = price - tax;
        System.out.println(total);
        return computeAmountDue(total);
    }

    public static double computeAmountDue(double price, double quantity) {
        double tax = quantity * price * 12 / 100;
        double total = quantity * price - tax;
        System.out.println(total);
        return computeAmountDue(total);
    }

    public static double computeAmountDue(double price, double quantity, double discount) {
        double tax = quantity * price * 12 / 100;
        double discount1 = (quantity * price + tax) * discount;
        double total = quantity * price - tax - discount1;
        System.out.println(total);
        return computeAmountDue(total);
    }
}

