package day_20Programming;

import java.util.Scanner;

public class SignUpPage {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);


        System.out.println("Enter first name: ");
        String firstName = src.nextLine().toLowerCase();
        char character = ' ';

        for (int i = 0; i < firstName.length(); i++) {
            character = firstName.charAt(i);
        }
        boolean first = (((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) && firstName.length() >= 2 && firstName.length() < 16 && !firstName.isEmpty() && !firstName.contains(" "));
        if (first) {
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
            System.out.println(firstName);
        } else {
            if (!first) {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Please enter a valid name");
                    firstName = src.nextLine().toLowerCase();

                      if(first) {
                          firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
                          System.out.println(firstName);
                          break;
                      }else {
                          continue;
                      }
                }

            }
            System.out.println("Enter last name: ");
            String lastName = src.nextLine().toLowerCase();
            char character1 = ' ';
            for (int i = 0; i < lastName.length(); i++) {
                character1 = lastName.charAt(i);
            }
            boolean last = (((character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122)) && lastName.length() >= 2 && lastName.length() < 16 && !lastName.isEmpty() && !lastName.contains(" ") && !lastName.equalsIgnoreCase(firstName));


            if (last) {
                lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

                System.out.println(lastName);

            } else {
                System.out.println("Please enter a valid last name!");
            }
        }
    }
}

