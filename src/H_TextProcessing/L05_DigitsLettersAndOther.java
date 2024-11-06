package H_TextProcessing;

import java.util.*;

public class L05_DigitsLettersAndOther {

    public static void main(String[] args) {

        /*Write a program that receives a single string and on the first line prints all the digits,
        on the second – all the letters, and on the third – all the other characters. There will always be at least one digit,
        one letter, and another character.*/

        Scanner scanner = new Scanner(System.in);
        StringBuilder characters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder miscellaneous = new StringBuilder();
        String input = scanner.nextLine();

        for (char currentCharacter : input.toCharArray()) {
            if (Character.isDigit(currentCharacter)) {
                numbers.append(currentCharacter);
            } else if (Character.isLetter(currentCharacter)) {
                characters.append(currentCharacter);
            } else {
                miscellaneous.append(currentCharacter);
            }
        }
        System.out.println(numbers.toString());
        System.out.println(characters.toString());
        System.out.println(miscellaneous.toString());
    }

}
