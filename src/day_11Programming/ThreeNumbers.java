package day_11Programming;

public class ThreeNumbers {
    public static void main(String[] args) {

        int n1=5;
        int n2=7;
        int n3=10;
        if(n1==n2&&n1!=n3){
            System.out.println(n1+" is equal to "+n2);
        }else if(n2==n3&&n2!=n1){
            System.out.println(n2+" is equal to "+n3);
        }else if(n3==n1&&n3!=n2){
            System.out.println(n3+" is equal to "+n1);
        }else if(n2==n3&&n2==n1){
            System.out.println(n2+"," +n3+" and "+n1+ " are equal numbers");
        }else{
            System.out.println(n2+","+n3+" and " +n1+ " are not equal numbers");
        }
        System.out.println("===============================================================");
        String equal=(n1==n2&&n1!=n3)?n1+" is equal to "+n2:(n2==n3&&n2!=n1)?n2+" is equal to "+n3:
                (n3==n1&&n3!=n2)?n3+" is equal to "+n1:(n2==n3&&n2==n1)?
                        n2+"," +n3+" and "+n1+ " are equal numbers"
                        :n2+","+n3+" and " +n1+ " are not equal numbers";
        System.out.println(equal);
    }
}
/*
write a program that can check the equality of the three given numberrs
                declare 3 numbers n1, n2, n3
                if n1 and n2 are equal  => n1&n2 are equal
                if n2 and n3 are equal ==> n2&n3 are equal
                if n3 and n1 are qual ==>n3&n1 are equal
                if all equal ==> all equal
                if none of them are euqal ==> none of them are equal

 */