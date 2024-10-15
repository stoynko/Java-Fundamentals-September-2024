package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class E09_Orders {

    public static void main(String[] args) {

        /*We are placing N orders at a time. You need to calculate the price on the following formula:
        ((daysInMonth * capsulesCount) * pricePerCapsule)

        Input / Constraints

            •	On the first line, you will receive integer N – the count of orders the shop will receive.
            •	For each order, you will receive the following information:
        o	Price per capsule - floating-point number in the range [0.00…5000.00].
        o	Days – integer in the range [1…31].
        o	Capsules count - integer in the range [0…7000000].

        The input will be in the described format, there is no need to check it explicitly.*/

        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double subTotal = 0;
        double total = 0;

        for (int i = 1; i <= orders; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int totalCapsules = Integer.parseInt(scanner.nextLine());
            subTotal = ((days * totalCapsules) * pricePerCapsule);
            total += subTotal;
            System.out.printf("The price for the coffee is: $%.2f%n", subTotal);
        }
        System.out.printf("Total: $%.2f%n", total);
    }
}
