package day_13Programming;

public class MaxHouse {
    public static void main(String[] args) {

                String houseType = "Villa";
                int maxOccupants = 0;

                switch (houseType) {
                    case "Tree house":
                        maxOccupants = 1;
                        break;
                    case "Mobile home":
                        maxOccupants = 2;
                        break;
                    case "Apartment":
                        maxOccupants = 4;
                        break;
                    case "Town house":
                        maxOccupants = 6;
                        break;
                    case "Villa":
                        maxOccupants = 8;
                        break;
                    case "Mansion":
                        maxOccupants = 10;
                        break;
                    default:
                        maxOccupants = 0;
                        break;

                }

                System.out.println(maxOccupants);
            }
        }
/*
Given a house type (String) print out the number of max occupants (int)
    Tree house: 1
    Mobile home: 2
    Apartment: 4
    Town house: 6
    Villa: 8
    Mansion: 10
 */

