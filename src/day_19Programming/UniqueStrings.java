package day_19Programming;

import java.util.Scanner;

public class UniqueStrings {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter length");
        int length = src.nextInt();
        String[] words = new String[length];
        System.out.println("Enter " + length + " words.");
        for (int i = 0; i < length; i++) {
            words[i] = src.next();
        }
        for (int i = 0; i < length; i++) {
            int count = 0;
            String each = words[i];
            for (int j = 0; j < length; j++) {
                if (each.equals(words[j])) {
                    count++;
                }
            }
            if(count==1){
                System.out.println("Unique word is : "+each);
            }else{
                System.out.println("Duplicate word is : "+each);
            }
        }
    }
}

/*
 write a program that can find the unique strings from string array
                                            .equals

 */