package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class E07_VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double total = 0;
        double costs = 0;
        boolean invalidProduct = false;
        boolean purchasingStarted = false;
        String purhcasedItem = "";
        while (!input.equals("End")) {
            if (!input.equals("Start")) {
                double insertedCoin = Double.parseDouble(input);
                if (insertedCoin == 0.1 || insertedCoin == 0.2 || insertedCoin == 0.5 || insertedCoin == 1 || insertedCoin == 2) {
                    total += insertedCoin;
                } else {
                    System.out.printf("Cannot accept %.2f %n", insertedCoin);
                }
            } else {
                purchasingStarted = true;
                input = scanner.nextLine();
                while (!input.equals("End")) {
                    switch (input) {
                        case "Nuts" -> {
                            costs = 2;
                            purhcasedItem = "Nuts";
                        }
                        case "Water" -> {
                            costs = 0.7;
                            purhcasedItem = "Water";
                        }
                        case "Crisps" -> {
                            costs = 1.5;
                            purhcasedItem = "Crisps";
                        }
                        case "Soda" -> {
                            costs = 0.8;
                            purhcasedItem = "Soda";
                        }
                        case "Coke" -> {
                            costs = 1;
                            purhcasedItem = "Coke";
                        }
                        default -> invalidProduct = true;
                    }
                    if (invalidProduct) {
                        System.out.println("Invalid product");
                    } else if (costs > total) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        total -= costs;
                        System.out.printf("Purchased %s%n", purhcasedItem);
                    }
                    input = scanner.nextLine();
                }
            }
            if (!purchasingStarted) {
                input = scanner.nextLine();
            }
        }
        System.out.printf("Change: %.2f", total);
    }
}
