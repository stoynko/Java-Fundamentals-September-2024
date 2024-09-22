package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class AE01_SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = new Integer[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        for (int k = 0; k < numbers.length ; k++) {
            System.out.println(numbers[k]);
        }
    }
}
