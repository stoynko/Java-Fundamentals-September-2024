package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class L03_PassedOrFailed {
    public static void main(String[] args) {

        /*Write a program that:
            •	Read a floating-point number, which represents a grade
            •	If the grade is equal or more than 3.00, print "Passed!"
            •	If the grade is smaller than 3.00, print "Failed!"*/

        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
