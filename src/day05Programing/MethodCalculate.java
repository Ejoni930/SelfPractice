package day05Programing;

public class MethodCalculate {
    public static void main(String[] args) {
     int highScorePosition=calculateHighScorePosition(1500);
     displayHighscorePosition("Erjon ",highScorePosition);
     highScorePosition=calculateHighScorePosition(800);
     displayHighscorePosition("Alex ",highScorePosition);
     highScorePosition=calculateHighScorePosition(300);
     displayHighscorePosition("Denis ",highScorePosition);

    }
    public static void displayHighscorePosition(String playerName, int highScorePosition){
        System.out.println(playerName+ "manage to get number "+highScorePosition+ " on the table");


    }
    public static int calculateHighScorePosition(int score){
        if(score>1000){
            return 1;
        }else if(score>500 && score<1000){
            return  2;
        }else return 3;
    }
}
