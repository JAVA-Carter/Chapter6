package Examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice = 10;
        int rand_pick = rand.nextInt(10) + 1;

        while (choice != rand_pick) {
            System.out.println("Pick a number between 1 and 10");
            choice = input.nextInt();

            if (choice == rand_pick) {
                System.out.println("Congrats");
            } else if (choice > rand_pick) {
                System.out.println("Lower");
            } else if (choice < rand_pick) {
                System.out.println("Higher");
            }
        }
    }
}