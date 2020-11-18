package day04Programming;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a, b, c, d, f;
        System.out.println("Enter first gpa:");

        a = sr.nextInt();
        System.out.println("Enter second gpa:");
        b = sr.nextInt();
        System.out.println("Enter third gpa:");
        c = sr.nextInt();
        System.out.println("Enter fourth gpa:");
        d = sr.nextInt();
        System.out.println("Enter fifth gpa: ");
        f=sr.nextInt();
        double average = (a+b+c+d+f)/5;
        System.out.println("Class average is " + average);

    }
}
