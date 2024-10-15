package B_DataTypesAndVariables;

import java.util.Scanner;

public class E02_SumDigits {

    public static void main(String[] args) {

        //You will be given a single integer. Your task is to find the sum of its digits.

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (number > 0) {

            int currentDigit = number % 10;
            sum += currentDigit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
