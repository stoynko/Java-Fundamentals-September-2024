package D_Methods;

import java.util.Scanner;

public class E01_SmallestOfThreeNumbers {

    public static void main(String[] args) {

        /*Write a method to print the smallest of three integer numbers. Use an appropriate name for the method.*/

        Scanner scanner = new Scanner(System.in);

        int numberA = Integer.parseInt(scanner.nextLine());
        int numberB = Integer.parseInt(scanner.nextLine());
        int numberC = Integer.parseInt(scanner.nextLine());
        System.out.println(getSmallest(numberA, numberB, numberC));
    }

    private static int getSmallest(int numberA, int numberB, int numberC) {
        return Math.min(Math.min(numberA, numberB), numberC);
    }
}
