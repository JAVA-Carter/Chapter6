package Assignments;

import java.util.Random;
import java.util.Scanner;

public class OpenDoorGame {
    public static void main(String[] args) {
        int doorNum;
        String[] doorPrize = {"One Million Dollars!!!", "Trash!!!", "Dirty Underwear!!!"};
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
        int myList = rand.nextInt(3);
        Scanner input = new Scanner(System.in);
        System.out.println("What door do you choose" +
                "\n1 \n2 \n3");
        doorNum = input.nextInt();

            if (doorNum == 1) {
                System.out.println(doorPrize[myList]);
            } else if (doorNum == 2) {
                System.out.println(doorPrize[myList]);
            } else if (doorNum == 3) {
                System.out.println(doorPrize[myList]);
            } else {
                System.out.println("Invalid Number");
            }

        }
    }
}