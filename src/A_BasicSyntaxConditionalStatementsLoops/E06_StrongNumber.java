package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class E06_StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());
        int initialInteger = integer;
        int totalFactorial = 0;

        while (integer > 0) {

            int currentDigit = integer % 10;
            int factorial = 1;
            for (int k = 2; k <= currentDigit; k++) {
                factorial = factorial * k;

            }
            totalFactorial += factorial;
            integer = integer / 10;
        }
        if (totalFactorial == initialInteger)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

