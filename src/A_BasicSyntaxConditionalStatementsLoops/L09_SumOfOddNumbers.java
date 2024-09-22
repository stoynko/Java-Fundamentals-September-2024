package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class L09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int sum = 0;
        int counter = 0;

        while (true) {
            if (counter == n)
                break;

            if (i % 2 == 1) {
                System.out.println(i);
                sum += i;
                counter++;
            }
            i++;
        }
        System.out.printf("Sum: %d", sum);
    }
}
