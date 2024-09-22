package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class E09_Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double subTotal = 0;
        double total = 0;

        for (int i = 1; i <= orders ; i++) {

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
