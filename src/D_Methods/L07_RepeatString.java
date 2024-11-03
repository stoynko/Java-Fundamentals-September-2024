package D_Methods;

import java.util.Scanner;

public class L07_RepeatString {

    public static void main(String[] args) {

        /*Write a method that receives a string and a repeat count n (integer).
          The method should return a new string (the old one repeated n times).*/

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(input, count));
    }

    private static String repeatString(String input, int count) {
        String result = "";
        for (int repeatCounter = 1; repeatCounter <= count; repeatCounter++) {
            result += input;
        }
        return result;
    }
}
