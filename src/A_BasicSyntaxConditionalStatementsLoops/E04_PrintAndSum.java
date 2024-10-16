package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class E04_PrintAndSum {
    public static void main(String[] args) {

        /*Write a program to display numbers from given start to given end and their sum. All the numbers will be integers.
        On the first line, you will receive the start number, on the second the end number.*/

        Scanner scanner = new Scanner(System.in);
        int integerA = Integer.parseInt(scanner.nextLine());
        int integerB = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (integerA <= integerB) {
            System.out.printf("%d ", integerA);
            sum += integerA;
            integerA++;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
