package U2T7_P2_MoreStringMethods;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Score = 0;
        int wordCount = 0;
        System.out.print("Enter the first word: ");
        wordCount = wordCount + 1;
        String wordBefore = scan.nextLine();
    
        while (Score < 50) {
        System.out.print("Enter another word: ");
        String wordAfter = scan.nextLine();
        wordCount = wordCount + 1;
        
        if (wordAfter.equals(wordBefore)){
            Score = Score - 10;
            System.out.println("-10 points: current word is the same as previous word; SCORE: " + Score);
        }
        else if (wordAfter.compareTo(wordBefore) < 0){
            Score = Score - 5;
            System.out.println("-5 points: current word alphabetically before; SCORE: " + Score);
        
        }
        else{
            Score = Score + 2;
            System.out.println("+2 points: current word alphabetically after; SCORE: " + Score);
        }

        if (!wordAfter.equals(wordBefore) && wordAfter.contains(wordBefore.substring(0,1))){
            Score = Score + 3;
            System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + Score);
        }
        if (!wordAfter.equals(wordBefore) && wordBefore.substring(wordBefore.length()-2).equals(wordAfter.substring(0,2))) {
            Score = Score + 5;
            System.out.println("+5 points: last 2 letters of previous word match first 2 letters of current; SCORE: " + Score);

        }

        wordBefore = wordAfter;
        }

        System.out.println("You WIN! It took you " + wordCount + " words! Challenge yourself again for a lower word count :D");
        scan.close();    
    }
}