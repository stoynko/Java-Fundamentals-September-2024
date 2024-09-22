package C_Arrays;

import java.util.Scanner;

public class L01_DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int index = Integer.parseInt(scanner.nextLine());
        if (index <= 0 || index > 7) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(weekdays[index - 1]);
        }
    }
}
