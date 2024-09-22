package B_DataTypesAndVariables;

import java.util.Scanner;

public class AE02_FromLeftToTheRight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rowsCount; i++) {

            long sum = 0;
            long numberA = scanner.nextLong();
            long numberB = scanner.nextLong();
            scanner.nextLine();
            if (numberA > numberB) {

                while (numberA != 0) {
                    sum += numberA % 10;
                    numberA = numberA / 10;
                }
            } else {
                while (numberB != 0) {
                    sum += numberB % 10;
                    numberB = numberB / 10;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}
