package D_Methods;

import java.util.Scanner;

public class E05_AddAndSubtract {

    public static void main(String[] args) {

        /*You will receive 3 integers.
        Write a method sum to get the sum of the first two integers and subtract the method that subtracts the third integer from the result from the sum method.*/

        Scanner scanner = new Scanner(System.in);
        int numberA = Integer.parseInt(scanner.nextLine());
        int numberB = Integer.parseInt(scanner.nextLine());
        int numberC = Integer.parseInt(scanner.nextLine());

        System.out.println(findSum(numberA, numberB) - numberC);
    }

    private static int findSum(int numberA, int numberB) {
        return numberA + numberB;
    }
}
