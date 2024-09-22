package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class L05_MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = Integer.parseInt(scanner.nextLine());

        String month = switch (digit) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Error!";
        };
        System.out.printf("%s", month);
    }
}
