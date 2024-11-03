package B_DataTypesAndVariables;

import java.util.Scanner;

public class L06_CharsToString {

    public static void main(String[] args) {

        //Write a program that reads 3 lines of input. On each line, you get a single character. Combine all the characters into one string and print it on the console.

        Scanner scanner = new Scanner(System.in);

        String charOne = scanner.nextLine();
        String charTwo = scanner.nextLine();
        String charThree = scanner.nextLine();

        String result = charOne + charTwo + charThree;

        System.out.println(result);
    }
}
