package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class AE03_GamingStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double cost = 0;
        double totalCost = 0;
        String purhcasedItem = "";
        boolean invalidProduct = false;
        boolean outOfMoney = false;
        String input = scanner.nextLine();
        while (true) {
            if (balance <= 0) {
                outOfMoney = true;
                break;
            }
            if (input.equals("Game Time")) {
                break;
            }
            switch (input) {
                case "OutFall 4" -> {
                    cost = 39.99;
                    purhcasedItem = "OutFall 4";
                }
                case "CS: OG" -> {
                    cost = 15.99;
                    purhcasedItem = "CS: OG";
                }
                case "Zplinter Zell" -> {
                    cost = 19.99;
                    purhcasedItem = "Zplinter Zell";
                }
                case "Honored 2" -> {
                    cost = 59.99;
                    purhcasedItem = "Honored 2";
                }
                case "RoverWatch" -> {
                    cost = 29.99;
                    purhcasedItem = "RoverWatch";
                }
                case "RoverWatch Origins Edition" -> {
                    cost = 39.99;
                    purhcasedItem = "RoverWatch Origins Edition";
                }
                default -> invalidProduct = true;
            }
            if (invalidProduct) {
                System.out.println("Not Found");
                invalidProduct = false;
            } else if (cost > balance) {
                System.out.println("Too Expensive");
            } else {
                balance -= cost;
                totalCost += cost;
                System.out.printf("Bought %s%n", purhcasedItem);
            }
            input = scanner.nextLine();
        }
        if (!outOfMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalCost, balance);
        } else {
            System.out.println("Out of money!");
        }

    }
}
