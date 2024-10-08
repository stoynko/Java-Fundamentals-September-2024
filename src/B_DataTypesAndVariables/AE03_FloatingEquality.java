package B_DataTypesAndVariables;

import java.util.Scanner;

public class AE03_FloatingEquality {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numberA = Double.parseDouble(scanner.nextLine());
        double numberB = Double.parseDouble(scanner.nextLine());
        boolean isEqual = false;
        double eps = 0.000001;
        double difference = 0;

        if (numberA > numberB) {
            difference = numberA - numberB;
        } else {
            difference = numberB - numberA;
        }

        isEqual = !(difference >= eps);
        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}