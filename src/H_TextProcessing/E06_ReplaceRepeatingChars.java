package H_TextProcessing;

import java.util.*;

public class E06_ReplaceRepeatingChars {

    public static void main(String[] args) {

        //Write a program that reads a string from the console and replaces any sequence of the same letters with a single corresponding letter.

        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        for (int index = 0; index < input.length() - 1; index++) {
            if (input.charAt(index) == input.charAt(index + 1)) {
                input.deleteCharAt(index + 1);
                index--;
            }
        }
        System.out.println(input);
    }
}
