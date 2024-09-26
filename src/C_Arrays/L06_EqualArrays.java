package C_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class L06_EqualArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isIdentical = false;
        int sum = 0;
        int indexBreakage = 0;
        int[] arrayA = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                         .toArray();
        int[] arrayB = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        for (int index = 0; index < arrayA.length; index++) {

            if (arrayA[index] == arrayB[index]) {
                isIdentical = true;
                sum += arrayA[index];
            } else {
                isIdentical = false;
                indexBreakage = index;
                break;
            }
        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", indexBreakage);
        }
    }
}
