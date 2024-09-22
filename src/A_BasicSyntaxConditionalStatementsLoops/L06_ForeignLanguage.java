package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class L06_ForeignLanguage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String language = switch (country) {
            case "USA", "England" -> "English";
            case "Spain", "Argentina", "Mexico" -> "Spanish";
            default -> "unknown";
        };

        System.out.printf("%s", language);
    }
}
