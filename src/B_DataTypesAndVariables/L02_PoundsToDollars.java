package B_DataTypesAndVariables;

import java.util.Scanner;

public class L02_PoundsToDollars {

    public static void main(String[] args) {

       /* Write a program that:
            •	Reads an floating-point number that represents quantity of British pounds for conversion
            •	Convert pounds to dollars (1 British Pound = 1.36 Dollars)
            •	Print the resulted dollars, formatted to the third decimal point*/

        Scanner scanner = new Scanner(System.in);
        float inputGBP = Float.parseFloat(scanner.nextLine());

        float outputUSD = inputGBP * 1.36f;

        System.out.printf("%.3f", outputUSD);
    }
}
