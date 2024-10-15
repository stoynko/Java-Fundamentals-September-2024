package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class AE04_ReverseString {
    public static void main(String[] args) {

        //Write a program that reverses a string and prints it on the console.

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int index = input.length() - 1; index >= 0; index--) {
            result.append(input.charAt(index));
        }
        System.out.println(result);
    }
}
