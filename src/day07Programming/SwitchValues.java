package day07Programming;

public class SwitchValues {
    public static void main(String[] args) {
         char character='A';
         switch (character) {
             case 'A':
                 System.out.println(" charcter is " +character);
                 break;
             case 'B':
                 System.out.println("It's charcter "+character );
                 break;
             case 'C':
                 System.out.println("It's charcter C " +character );
                 break;
             case 'D':
                 System.out.println("It's charcter D "+character );
                 break;
             case 'E':
                 System.out.println("It's charcter E "+character);
             default:
                 System.out.println("not found ");
                 break;

         }
    }
}
