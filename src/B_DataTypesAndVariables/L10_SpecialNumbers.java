package B_DataTypesAndVariables;

import java.util.Scanner;

public class L10_SpecialNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            int number = i;
            int secondDigit = number % 10;
            int firstDigit = number / 10;
            int sum = firstDigit + secondDigit;

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", number);
            } else {
                System.out.printf("%d -> False%n", number);
            }
        }
    }
}
