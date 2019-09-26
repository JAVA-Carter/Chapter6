package Assignments;

import java.util.Scanner;

public class TestScoreStatistics {
    public static void main(String[] args){
        int scores = 0;
        int high = 0;
        int low = 100;
        int avg;
        int scoreTotal = 0;
        int numOfEntries = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the test scores");
        scores = input.nextInt();
        while (scores != 999){
            System.out.println("Enter another test score or exit by typing 999");
            scores = input.nextInt();
            if (scores < 0) {
                System.out.println("Sorry that can not be a score");
            }
            else if (scores > 100){
                System.out.println("Sorry that can not be a score");
            }

            if(scores > high){
                high = scores;
            }
            else if(scores < low ){
                low = scores;
            }
            numOfEntries ++;

            scoreTotal = scoreTotal + scores;

        }
        avg = scoreTotal/numOfEntries;

        System.

    }
}
