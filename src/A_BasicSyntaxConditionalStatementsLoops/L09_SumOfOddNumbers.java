package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class L09_SumOfOddNumbers {
    public static void main(String[] args) {

        /*Write a program that prints the next n odd numbers (starting from 1) and on the last row prints the sum of them.
        On the first line, you will receive a number – n. This number shows how many odd numbers you should print.
        Print the next n odd numbers, starting from 1, separated by new lines. On the last line, print the sum of these numbers.
        Constraints:
            •n will be in the interval [1…100]*/

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
