package B_DataTypesAndVariables;

import java.util.Scanner;

public class E07_WaterOverflow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte iterations = Byte.parseByte(scanner.nextLine());
        short totalLiters = 0;

        for (int i = 0; i < iterations; i++) {

            short input = Short.parseShort(scanner.nextLine());
            if (totalLiters + input > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            } else {
                totalLiters += input;
            }
        }
        System.out.println(totalLiters);
    }
}
