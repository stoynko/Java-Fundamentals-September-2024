package D_Methods;

import java.util.Scanner;

public class L01_SignOfInteger {

    public static void main(String[] args) {

        //Create a method that prints the sign of an integer number.

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printSignOfNumber(number);
    }

    private static void printSignOfNumber(int number) {
        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
