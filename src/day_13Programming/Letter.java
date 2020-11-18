package day_13Programming;

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter your letter : ");
        String letter= src.nextLine();
        if(letter.equals(letter.toLowerCase())){
            System.out.println("The letter you entered is Lower case");
        }else {
            System.out.println("The letter you entered is Upper case");
        }
    }
}
