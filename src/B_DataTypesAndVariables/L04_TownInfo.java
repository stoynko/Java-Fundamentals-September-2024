package B_DataTypesAndVariables;

import java.util.Scanner;

public class L04_TownInfo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cityName = scanner.nextLine();
        long cityPopulation = Integer.parseInt(scanner.nextLine());
        short cityArea = Short.parseShort(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", cityName, cityPopulation, cityArea);
    }
}
