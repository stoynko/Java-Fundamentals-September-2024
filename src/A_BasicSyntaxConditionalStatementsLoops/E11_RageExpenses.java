package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class E11_RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gamesLost = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());
        int counterHeadset = 0;
        int counterMouse = 0;
        int counterKeyboard = 0;
        int counterDisplay = 0;

        for (int gameCount = 1; gameCount <= gamesLost; gameCount++) {
            if (gameCount % 2 == 0) {
                counterHeadset++;
            }
            if (gameCount % 3 == 0) {
                counterMouse++;
            }
            if (gameCount % 6 == 0) {
                counterKeyboard++;
            }
            if (gameCount % 12 == 0) {
                counterDisplay++;
            }
        }
        double expenses = (counterHeadset * priceHeadset) + (counterMouse * priceMouse) + (counterKeyboard * priceKeyboard) + (counterDisplay * priceDisplay);
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}

