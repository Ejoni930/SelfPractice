package day_15Programming;

import java.util.Scanner;

public class CostOfProduct {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        System.out.println("Enter product quantity ");
        double quantity= src.nextDouble();
        System.out.println("Enter product price $ ");
        double price= src.nextDouble();
        double cost=quantity*price;
        double discount=0;
        if(cost>=5000){
            discount=(cost*10/100);
        }else{
            discount=0;
        }
        double totalCost=cost-discount;
        System.out.println("Cost is : "+cost+" $");
        System.out.println("Discount is : "+discount+" $");
        System.out.println("Total after discount will be : "+totalCost+" $");
    }
}
/*
- Cost can be calculated as the selling price of the product times the quantity sold, i.e.
 Cost price × quantity. Write a program that asks the user to enter product
 price and quantity and then calculate the Cost.
  If the Cost is more than 5000 a discount is 10% offered.
  Program should display the discount and discounted Cost.
    Ex: 100, 3 -> 300 --> Cost: 300, Discount: 0%
    Ex: 100, 60 -> 6000 -> Cost: 5400, Discount: 10%

 */