package B_DataTypesAndVariables;

import java.util.Scanner;

public class E04_SumOfChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        short sum = 0;

        for (int i = 1; i <= n; i++) {

            char character = scanner.nextLine().charAt(0);
            short ASCII = (short) character;
            sum += ASCII;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
