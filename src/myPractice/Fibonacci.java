package myPractice;

public class Fibonacci {
    public static void main(String[] args) {
         int f1=0;
         int f2=1;
         int f;
         int number=15;
        for (int i=2;i<=number;i++){

            f=f1+f2;//(f1=0+ f2=1),(f1=1+f2=1), (f1=1+f2=2)
            f1=f2;//     (1==1)        f1=1        f1=2
            f2=f;//        f2=1        f2=2         f2=3
            System.out.println(f1);
        }


    }
}
