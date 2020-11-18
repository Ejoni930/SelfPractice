package myPractice;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter a letter please : ");
              char letter=src.next().charAt(0);
           
              if(letter=='a'|| letter=='u'||letter=='i'||letter=='e'||letter=='o'){

                  System.out.println("the letter you entered is a vowel");
              }else{
                  System.out.println("the letter you entered is a constant");
              }
    }
}
/*
 Write a Java program to check whether an alphabet is vowel or consonant using if else.
 */