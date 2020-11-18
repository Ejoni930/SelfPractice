package day04Programming;

import java.util.*;
public class Calculate_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInt, secondInt, thirdInt;

        System.out.println("Enter first Int :");
        firstInt=sc.nextInt();
        System.out.println("Enter second Int :");
        secondInt=sc.nextInt();
        System.out.println("Enter third Int :");
        thirdInt=sc.nextInt();
        int firstResult=(firstInt+secondInt) / thirdInt;
        int secondResult=(secondInt*thirdInt) / (secondInt+firstInt);
        int thirdResult=(firstInt*thirdInt) % secondInt;

        System.out.println("First result is: " + firstResult);
        System.out.println("Second result is: " + secondResult);
        System.out.println("Third result is:" + thirdResult);








    }
}
