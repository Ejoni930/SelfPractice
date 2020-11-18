package day_12Programming;

public class AgeGroup {
    public static void main(String[] args) {
       int age=60;
       String ageGroup=" ";
       if(age>1&&age<150){
           if(age<21){
               ageGroup="Teenager";
           }else if(age>=21&&age<55){
               ageGroup="Adults";
           }else{
               ageGroup="Senior";
           }

       }else {
           ageGroup = "You did not born yet or you are to old to exist sorry :) ";
       }
        System.out.println("Your age group is : "+ageGroup);
        System.out.println("=========================================");
        String groupAge=" ";
        if(age>1&&age<150){

            groupAge=(age<21)?"Teenager":(age>=21&&age<55)?"Adult":"Senior";

        }else{
            groupAge = "You did not born yet or you are to old to exist sorry :) ";
        }
        System.out.println("Your age group is : "+groupAge);
    }
}
/*
write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                Hint:  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF

 */