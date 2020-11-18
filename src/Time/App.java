package Time;

import java.util.Scanner;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class App {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        Watch dateTimeMonth=new Watch(5,8,1991,4);
        dateTimeMonth.setDay(6);
        dateTimeMonth.setDayOfTheWeek(5);
        dateTimeMonth.setMonth(8);
        dateTimeMonth.setYear(1991);
        //LocalDateTime myTime=new LocalDateTime.now();
      //  DateTimeFormatter  myFormat=new DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      //  String formattedDate = myTime.format(myFormat);
        System.out.println( dateTimeMonth.getDayOfTheWeek()+"/"+dateTimeMonth.getDay()+"/"+dateTimeMonth.getMonth()+"/"+dateTimeMonth.getYear());
        //System.out.println("Actual time and Date is : " + formattedDate);

    }
}
