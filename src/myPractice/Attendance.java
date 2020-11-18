package myPractice;

import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number of classes held : ");
        double classesHeld = src.nextDouble();
        System.out.println("Enter the number of classes the student attended : ");
        double classesAttend = src.nextDouble();
        if(classesAttend>classesHeld*75/100){
            System.out.println("Student is allowed to sit in exam");
        }else {
            System.out.println("Student is not allowed to sit in exam");
        }


    }
}
/*
• A student will not be allowed to sit in exam if his/her attendance is less than 75%.
1.  Take following input
2.  Number of classes held
3.  Number of classes attended.
4.  And print percentage of class attended
         Is student is allowed to sit in exam or not.
 */