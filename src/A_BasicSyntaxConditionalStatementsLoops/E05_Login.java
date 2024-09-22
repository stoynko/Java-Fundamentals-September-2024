package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class E05_Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        for (int index = username.length() - 1; index >= 0; index--) {
            password.append(username.charAt(index));
        }
        String passwordInput = scanner.nextLine();
        int counterAttempts = 0;
        boolean isBlocked = false;

        while (!passwordInput.contentEquals(password)) {
            counterAttempts++;
            if (counterAttempts == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            passwordInput = scanner.nextLine();
        }

        if (passwordInput.contentEquals(password)) {
            System.out.printf("User %s logged in.", username);
            return;
        }
    }
}
