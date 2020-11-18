package day_16Programming;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        System.out.println("Enter first and last names:");
        String fullName = src.nextLine();
        String f = "";
        String l = "";
        String[] ar = fullName.split(" ");
        for (int i = 0; i < ar.length - 1; i++) {
            f = (ar[0].substring(0, 1).toUpperCase())
                    + (ar[0].substring(1, ar[0].length()).toLowerCase());
            l = (ar[1].substring(0, 1).toUpperCase())
                    + (ar[1].substring(1, ar[1].length()).toLowerCase());
        }
        System.out.println(f + " " + l);
    }
}
