package B_DataTypesAndVariables;

import java.util.Scanner;

public class L07_ReversedChars {

    public static void main(String[] args) {

        //Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.

        Scanner scanner = new Scanner(System.in);

        String charOne = scanner.nextLine();
        String charTwo = scanner.nextLine();
        String charThree = scanner.nextLine();

        System.out.printf("%s %s %s", charThree, charTwo, charOne);
    }
}
