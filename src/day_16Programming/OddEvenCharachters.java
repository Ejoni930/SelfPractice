package day_16Programming;

import java.util.Scanner;

public class OddEvenCharachters {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        String word= src.next();
        int index=word.length()%2;
        int length=word.length();
        if(length==1) {
            System.out.print(word + word+word);
        }else if(length==2){
            System.out.print(word + word);
        }else if(index!=0){
        int middle=length/2;
        System.out.println(word.substring(middle,middle+1));
        }else{
            int middle=length/2;
            System.out.println(word.substring(middle-1,middle+1));
        }
    }
}
