package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class E02_Division {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());
        boolean isDivisible = false;
        int[] divisors = {2, 3, 6, 7, 10};
        int maxDivisor = Integer.MIN_VALUE;

        for (int i = 0; i < divisors.length; i++) {

            if (integer % divisors[i] == 0) {
                maxDivisor = divisors[i];
                isDivisible = true;
            }
        }
        if (isDivisible)
            System.out.printf("The number is divisible by %d", maxDivisor);
        else
            System.out.println("Not divisible");
    }
}
