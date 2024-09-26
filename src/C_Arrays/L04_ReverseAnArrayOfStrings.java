package C_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L04_ReverseAnArrayOfStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int counter = 0;
        for (int index = 0; index < input.length / 2; index++) {
            String temp = input[index];
            input[index] = input[input.length - 1 - index];
            input[input.length - 1 - index] = temp;
        }
        System.out.println(String.join(" ", input));
    }
}
