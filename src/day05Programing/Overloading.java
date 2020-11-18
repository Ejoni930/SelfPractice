package day05Programing;

public class Overloading {
    public static void main(String[] args) {
    calcFeetAndInches(5,9);
    calcFeetandInches(152);

    }
    public static double calcFeetAndInches(double feet,double inches){
        if((feet>=0)||((inches<=12)||(inches>0))){
            double centimetres = (feet*12)*2.54;
            centimetres+=inches*2.54;
            System.out.println(feet+" feet "+inches+" inches is "+centimetres+" centimetres");
            return centimetres;

        }else{
            return -1;
        }



    }
    public static double calcFeetandInches(double inches){
        if (inches>=0){
            double feet = (int)inches/12;
            double remainingInches=(int) inches%12;
            return calcFeetAndInches(feet,remainingInches);

        }else{
            return -1;
        }
    }
}
