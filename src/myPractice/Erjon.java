package myPractice;

public class Erjon {
    public static void main(String[] args) {
/*
        int arr[] = {1,2,3,4,5};
        int count = 0;
         int i=0;
        for(arr[i] =i ; i<arr.length-1; i++ ){
            if(arr[i]%2==0) {
                arr[i] *= 2;
            }
            System.out.print(arr[i]);

        }
*/
        int arr1[] = {'a','b','c','d','e'};

        for(int j= 0 ; j<5; j++){
            System.out.print(" "+ (char)arr1[j]);
            System.out.println(arr1[j]);
        }
        char[] a = {'A', 'S', 'I', 'S', 'H'};

        int i = 4;

        do {
            System.out.print(a[i]);
            i--;
        }while (i>0);

        int [] array = {1,2,3,4,5};

        for(int z = -1; z<5;z++)
            System.out.print(array[z]);
    }
}
