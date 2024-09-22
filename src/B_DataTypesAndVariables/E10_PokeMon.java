package B_DataTypesAndVariables;

import java.util.Scanner;

public class E10_PokeMon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        double percentageComparator = pokePower * 0.5;
        int distance = Integer.parseInt(scanner.nextLine());
        byte exhaustionFactor = Byte.parseByte(scanner.nextLine());
        int pokeCounter = 0;

        while (pokePower >= distance) {

            pokePower = pokePower - distance;
            pokeCounter++;

            if (pokePower == percentageComparator && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokeCounter);
    }
}
