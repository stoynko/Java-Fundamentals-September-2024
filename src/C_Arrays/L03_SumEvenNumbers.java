package C_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L03_SumEvenNumbers {

    public static void main(String[] args) {

        //Read an array from the console and sum only the even numbers.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}