package B_DataTypesAndVariables;

import java.util.Scanner;

public class E09_SpiceMustFlow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int spiceYield = Integer.parseInt(scanner.nextLine());
        int minedTotal = 0;
        byte daysCounter = 0;

        while (spiceYield >= 100) {

            daysCounter++;
            minedTotal += spiceYield - 26;

            spiceYield -= 10;
        }
        minedTotal -= 26;
        if (minedTotal < 0) {
            minedTotal = 0;
        }

        System.out.println(daysCounter);
        System.out.println(minedTotal);
    }

}
