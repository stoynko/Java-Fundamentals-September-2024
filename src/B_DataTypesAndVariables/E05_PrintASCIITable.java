package B_DataTypesAndVariables;

import java.util.Scanner;

public class E05_PrintASCIITable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short start = Short.parseShort(scanner.nextLine());
        short end = Short.parseShort(scanner.nextLine());

        for (short i = start; i <= end; i++) {

            char currentChar = (char) i;
            System.out.printf("%s ", currentChar);
        }
    }
}

