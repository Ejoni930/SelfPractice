package myPractice;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        System.out.println("Enter your cost price $ : ");
        double costPrice=src.nextDouble();
        System.out.println("Enter your selling price $ : ");
        double sellingPrice=src.nextDouble();
        double profit = sellingPrice-costPrice;
        double loss=costPrice-sellingPrice;
        if(profit>loss){
            System.out.println("Your profit is : "+profit+" $");
        }else if(profit==loss){
            System.out.println("There is no profit or loss ");
        }else{
            System.out.println("Your loss is : "+loss+" $");
        }
    }
}
/*
• Write a  program , input cost price and selling price of a product and check profit or loss.
Also calculate total profit or loss using if else. (Formula to calculate profit and loss
Profit = S.P - C.P (Where S.P is Selling Price and C.P is Cost Price)
Loss = C.P - S.P)

 */