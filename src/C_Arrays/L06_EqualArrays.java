package C_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L06_EqualArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isIdentical = false;
        int sum = 0;
        int indexBreakage = 0;
        int[] arrayA = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrayB = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int currentIndex = 0; currentIndex < arrayA.length; currentIndex++) {
            if (arrayA[currentIndex] == arrayB[currentIndex]) {
                isIdentical = true;
                sum += arrayA[currentIndex];
            } else {
                isIdentical = false;
                indexBreakage = currentIndex;
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
