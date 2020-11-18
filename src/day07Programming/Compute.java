package day07Programming;

public class Compute {

    public static void main(String[] args) {

        double heightFeet =5.10;
        double heightInInches=heightFeet*12;
        double squareOfHeight=heightInInches*heightInInches;
        int weight = 190;
        double bmi=weight/squareOfHeight*703;
        boolean healthyBmi=(bmi>18)&&((bmi<25));
        boolean underWeight=bmi<18;
        boolean overWeight= bmi>25;
        System.out.println(bmi);
        System.out.println(bmi+" You are healthy "+healthyBmi);
        System.out.println(bmi+" You have to loose weight "+overWeight);
        System.out.println(bmi+" You have to gain weight "+underWeight);
    }
}
/*
write a program computes and prints the BMI for an
individual who is 5 feet 10 inches tall and weighs 195 pounds:
weight / (height * height) * 703;
 */