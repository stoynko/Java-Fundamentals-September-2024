package D_Methods;

import java.util.Scanner;

public class E02_VowelsCount {

    public static void main(String[] args) {

        /*Write a method that receives a single string and prints the count of the vowels. Use an appropriate name for the method.*/

        Scanner scanner = new Scanner(System.in);

        String input = (scanner.nextLine()).toLowerCase();
        System.out.println(getVowelCount(input));
    }

    private static int getVowelCount(String input) {
        String vowels = "aeiou";
        int vowelCounter = 0;
        for (char currentChar : input.toCharArray()) {
            if (vowels.contains(String.valueOf(currentChar))) {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }
}