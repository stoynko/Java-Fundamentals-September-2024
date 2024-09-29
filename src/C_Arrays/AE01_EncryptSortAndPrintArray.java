package C_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AE01_EncryptSortAndPrintArray {

    public static void main(String[] args) {

      /*Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
            •	The code of each vowel multiplied by the string length.
            •	The code of each consonant is divided by the string length.
        Sort the number sequence in ascending order and print it on the console.
        On the first line, you will always receive the number of strings you must read.*/

        Scanner scanner = new Scanner(System.in);

        int stringCount = Integer.parseInt(scanner.nextLine());
        int[] results = new int[stringCount];
        String vowels = "aeiouaeiouAEIOU";

        for (int currentString = 0; currentString < stringCount; currentString++) {

            char[] word = scanner.nextLine().toCharArray();
            for (int index = 0; index <= word.length - 1; index++) {

                int currentCharASCII = word[index];
                if (vowels.indexOf(word[index]) != -1) {
                    results[currentString] += currentCharASCII * word.length;
                } else{
                    results[currentString] += currentCharASCII / word.length;
                }
            }
        }
        Arrays.sort(results);
        for (int score : results) {
            System.out.println(score);
        }
    }
}
