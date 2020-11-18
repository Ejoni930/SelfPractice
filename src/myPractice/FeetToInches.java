package myPractice;

public class FeetToInches {
    public static void main(String[] args) {


double centimetres=calcFeetAndInchesToCentimetres(5,10);
        calcFeetAndInchesToCentimetres(100);
    }
    public static double calcFeetAndInchesToCentimetres(double feet,double inches){
        if(feet<0||inches<0&&(inches>12)){
            return -1;
        }
            double centimetres=(feet*12)*2.54;
           centimetres+=inches*2.54;
        System.out.println(feet+" feet "+inches+" inches = "+centimetres+" cm");
          return centimetres;
    }
    public static double calcFeetAndInchesToCentimetres(double inches){
        if(inches<0){
         return -1;
        }
        double feet=(int)inches/12;
         double remainingInches=(int)inches%12;


        System.out.println(inches+" inches is equal to "+feet+" feet "+remainingInches+" inches");
        return calcFeetAndInchesToCentimetres(feet,remainingInches);

    }
}
