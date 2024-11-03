package G_AssociativeArraysLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.Scanner;

public class L04_WordFilter {

    public static void main(String[] args) {

        //Read an array of strings, and take only words whose length is even. Print each word on a new line.

        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split("\\s+")).filter(w -> w.length() % 2 == 0).toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
