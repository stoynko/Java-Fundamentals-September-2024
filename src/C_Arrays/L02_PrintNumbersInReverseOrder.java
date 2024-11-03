package C_Arrays;

import java.util.Scanner;

public class L02_PrintNumbersInReverseOrder {

    public static void main(String[] args) {

        //Read n numbers and print them in reverse order.

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[input];
        for (int i = 0; i < input; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.printf("%d ", numbers[j]);
        }
    }
}
