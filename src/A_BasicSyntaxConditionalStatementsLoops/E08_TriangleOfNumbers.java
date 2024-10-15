package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class E08_TriangleOfNumbers {
    public static void main(String[] args) {

        //Write a program that receives a number – n and prints a triangle from 1 to n.

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= i; k++) {

                System.out.print(i + " ");
            }

            System.out.println(" ");
        }
    }
}
