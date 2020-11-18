package day_16Programming;

import java.util.Scanner;

public class Domain {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        System.out.println("Enter your email");
        String email= src.nextLine();
        int firstIndex=email.indexOf('@')+1;
        int lastIndex=email.indexOf('.');
        String domain=email.substring(firstIndex,lastIndex);
        System.out.println(domain);
    }
}
