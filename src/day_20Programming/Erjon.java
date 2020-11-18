package day_20Programming;

import java.util.Arrays;

public class Erjon {
    public static void main(String[] args) {
        String strOne = "java"; // literal
        String strTwo = "java"; // literal
        String strThree = new String("java");
        String strFour = new String("java");

        System.out.println(strOne == strTwo);
        System.out.println(strOne == strThree);
        System.out.println(strThree == strFour);
        String email="erjon_domi@hotmail.com";
        int index_=email.indexOf('_')+1;
        int indexAt=email.indexOf('@');
        int indexOfDot=email.lastIndexOf('.');
        String lastName=email.substring(index_,indexAt);
        String firstName=email.substring(0,index_-1);
        String domain=email.substring(indexAt+1,indexOfDot);
        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("domain = " + domain);
        int arr[] = {1,2,3,4,5};

        for(int i = 0 ; i<4;i++){
            System.out.print(arr[++i]);

        }
        System.out.println();
        int arr1[] = {'a','b','c','d','e'};
        System.out.println(arr1);
        System.out.println();
        for(int i = 0 ; i<5; i++){
            System.out.print(" " + arr1[i]);
        }
        System.out.println();
        for(int i = 0 ; i<5; i++){
            System.out.print(" "+ (char)arr1[i]);
        }
        System.out.println();
        int[] array = { 1, 4, 3, 6 };
        int sum    = 0;

        // scan the array
        for ( int i=0; i < array.length; i++ )
        {
            sum = sum + array[ i ] ;
        }
        System.out.println( sum );
        //int[] array = { 1, 4, 3, 6 };
        for ( int i=0; i < array.length; i++ )
        {
            //array[ i ] = 2*array[ i ];
            array[ i ] = 2*i;
            System.out.println(array[i]);
        }
        int[] array2 = new int[10];

        // scan the array
       /* for ( int i=0; i < array2.length; i++ )
        {
            array[ i ] = 2*i;
            System.out.println(array2[i]);
        }
        */

        int[] numbers = new int[8];//0,1,2,3,4,5,6,7
        numbers[1] = 4;
        numbers[4] = 99;
        numbers[7] =3;
        int x = numbers[1];
        x=4;
        numbers[x] = 44;
        numbers[numbers[7]] = 11;
        System.out.println(Arrays.toString(numbers));
        // uses numbers[7] as index
    }
}
