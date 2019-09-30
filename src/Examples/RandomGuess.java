package Examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice = 100;
        int rand_pick = rand.nextInt(99) + 1;
        int count = 0;

        while (choice != rand_pick) {


            System.out.println("\n Pick a number between 1 and 100");
            choice = input.nextInt();

            if (choice == rand_pick) {
                System.out.println("Congrats");
            } else if (choice > rand_pick) {
                System.out.println("Lower");
            } else if (choice < rand_pick) {
                System.out.println("Higher");
            }
            System.out.println("# of guesses [" + count + "]");
            count++;
        }
        System.out.println("it took you " + count + " tries to guess the number");
    }
}