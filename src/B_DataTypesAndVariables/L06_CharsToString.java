package B_DataTypesAndVariables;

import java.util.Scanner;

public class L06_CharsToString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String charOne = scanner.nextLine();
        String charTwo = scanner.nextLine();
        String charThree = scanner.nextLine();

        String result = charOne + charTwo + charThree;
        System.out.println(result);
    }
}
