package C_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L05_EvenAndOddSubtraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] % 2 == 0) {
                sumEven += numbers[index];
            } else {
                sumOdd += numbers[index];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
