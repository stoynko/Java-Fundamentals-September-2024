package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class L04_TimeAfterThirty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (minutes + 30 > 59) {
            hour++;
            if (hour > 23) {
                hour = 0;
            }
            minutes = (minutes + 30) - 60;
        } else
            minutes = minutes + 30;

        System.out.printf("%d:%02d", hour, minutes);
    }
}
