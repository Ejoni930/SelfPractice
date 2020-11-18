package day_12Programming;

public class ConvertNubers {
    public static void main(String[] args) {
        int number=9;
        String numName=" ";
        if(number>=0&&number<=9){
            if(number==1){
                numName="One";
            }else if(number==2){
                numName="Two";
            }else if(number==3){
                numName="Three";
            }else if(number==4){
                numName="Four";
            }else if(number==5){
                numName="Five";
            }else if(number==6){
                numName="Six";
            }else if(number==7){
                numName="Seven";
            }else if(number==8){
                numName="Eight";
            }else {
                numName="Nine";
            }

        }else{
            numName="Wrong number";
        }
        System.out.println("The number you entered is : "+numName);
        System.out.println("========================================");
        String numberName=" ";
        if(number>=0&&number<=9){

             numberName=(number==1)?"One":(number==2)?"Two":(number==3)?"Three"
                     :(number==4)?"Four":(number==5)?"Five":(number==6)?"Six"
                     :(number==7)?"Seven":(number==8)?"Eight":"Nine";

        }else{
           numberName="Wrong number";
        }
        System.out.println("The number you entered is : "+numberName);
    }
}
/*
 write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
            Note: MUST USE NESTED IF

 */