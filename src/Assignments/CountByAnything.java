package Assignments;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        int count;
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number >>> " );

        count = input.nextInt();
        for ( int i = 0; i < 100; i++) {
            num = num + count;
            System.out.print(num);
            if (i == 9)
                System.out.println();
            else if (i == 19)
                System.out.println();
            else if (i == 29)
                System.out.println();
            else if (i == 39)
                System.out.println();
            else if (i == 49)
                System.out.println();
            else if (i == 59)
                System.out.println();
            else if (i == 69)
                System.out.println();
            else if (i == 79)
                System.out.println();
            else if (i == 89)
                System.out.println();


        }
//        while(count >3){
//            System.out.print(count);
//            if (count % 30 == 0){
//                System.out.println(count);
//            }
//
//
//            count = count -3;
//        }
    }
}