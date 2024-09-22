package B_DataTypesAndVariables;

import java.util.Scanner;

public class L02_PoundsToDollars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float inputGBP = Float.parseFloat(scanner.nextLine());
        float outputUSD = inputGBP * 1.36f;
        System.out.printf("%.3f", outputUSD);
    }
}
