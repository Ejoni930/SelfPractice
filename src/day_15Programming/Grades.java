package day_15Programming;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter your points in your first subject between 0-100 : ");
        int subject1=src.nextInt();

        System.out.println("Enter your points in your second subject between 0-100 : ");
        int subject2=src.nextInt();


        System.out.println("Enter your points in your third subject between 0-100 : ");
        int subject3=src.nextInt();

        int totalGrade=(subject1+subject2+subject3)/3;
        String grade=" ";
        if(totalGrade<=100&&totalGrade>=0) {
            if(totalGrade>=90){
                grade="A";
            }else if(totalGrade>=80){
                grade="B";
            }else if(totalGrade>=70){
                grade="C";
            }else if(totalGrade>60){
                grade="D";
            }else{
                grade="F";
            }
        }else{
          grade="Points can not be greater than 100";
        }
        System.out.println("Your average is : "+totalGrade);
        System.out.println("Your grade is : "+grade);
    }
}
/*- The marks obtained by a student in 3 different subjects are input by the user. Your program should calculate the average of subjects. The student gets a grade as per the following rules:
    90-100  A
    80-89   B
    70-79   C
    60-69   D
    0-59    F
    Ex: 86, 74, 90 -> B
*/