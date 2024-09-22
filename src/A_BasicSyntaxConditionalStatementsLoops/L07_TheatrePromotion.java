package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class L07_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        boolean isValid = true;

        if (age >= 0 && age <= 18) {
            switch (dayType) {
                case "Weekday" -> price = 12;
                case "Weekend" -> price = 15;
                case "Holiday" -> price = 5;
            }
        } else if (age > 64 && age <= 122) {
            switch (dayType) {
                case "Weekday" -> price = 12;
                case "Weekend" -> price = 15;
                case "Holiday" -> price = 10;
            }
        } else if (age > 18 && age <= 64) {
            switch (dayType) {
                case "Weekday" -> price = 18;
                case "Weekend" -> price = 20;
                case "Holiday" -> price = 12;
            }
        } else {
            isValid = false;
        }

        if (isValid)
            System.out.printf("%d$", price);
        else
            System.out.println("Error!");
    }
}
