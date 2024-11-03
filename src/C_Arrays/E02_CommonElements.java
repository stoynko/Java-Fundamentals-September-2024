package C_Arrays;

import java.util.Scanner;

public class E02_CommonElements {

    public static void main(String[] args) {

        //Write a program that prints common elements in two arrays. You have to compare the elements of the second array to the elements of the first.

        Scanner scanner = new Scanner(System.in);

        String[] arrayA = scanner.nextLine().split(" ");
        String[] arrayB = scanner.nextLine().split(" ");

        for (String elementArrayB : arrayB) {
            for (String elementArrayA : arrayA) {
                if (elementArrayB.equals(elementArrayA)) {
                    System.out.printf("%s ", elementArrayB);
                }
            }
        }
    }
}
