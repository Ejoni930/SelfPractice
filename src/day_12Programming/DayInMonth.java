package day_12Programming;

public class DayInMonth {
    public static void main(String[] args) {
        int month=1;
        String daysOfMonth=" ";
        if(month>0&&month<=12){
            if(month==1){
                daysOfMonth="Month is Jan and it has 31 Days";
            }else if(month==2){
                daysOfMonth="Month is Feb and it has 28 Days";
            }else if(month==3){
                daysOfMonth="Month is March and it has 31 Days";
            }else if(month==4){
                daysOfMonth="Month is April and it has 30 Days";
            }else if(month==5){
                daysOfMonth="Month is May and it has 31 Days";
            }else if(month==6){
                daysOfMonth="Month is June and it has 30 Days";
            }else if(month==7){
                daysOfMonth="Month is July and it has 31 Days";
            }else if(month==8){
                daysOfMonth="Month is August and it has 31 Days";
            }else if(month==9){
                daysOfMonth="Month is Sept and it has 30 Days";
            }else if(month==10){
                daysOfMonth="Month is Oct and it has 31 Days";
            }else if(month==11){
                daysOfMonth="Month is Nov and it has 30 Days";
            }else {
                daysOfMonth="Month is Dec and it has 31 Days";
            }

        }else {
            daysOfMonth="Month does not exist";
        }
        System.out.println(daysOfMonth);

    }
}
/*
write a program that can find the number of days in a month
            Note: MUST USE NESTED IF

 */