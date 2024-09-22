package B_DataTypesAndVariables;

import java.util.Scanner;

public class AE06_BalancedBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte rowCount = Byte.parseByte(scanner.nextLine());
        byte openingCounter = 0;
        boolean isBalanced = true;

        for (int i = 1; i <= rowCount; i++) {

            String input = scanner.nextLine();
            if (input.length() == 1) {
                if (input.equals("(")) {
                    openingCounter++;
                } else if (input.equals(")")) {
                    if (openingCounter > 0) {
                        openingCounter--;
                    } else {
                        isBalanced = false;
                    }
                }
            }
        }
        if (isBalanced && openingCounter == 0) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}

