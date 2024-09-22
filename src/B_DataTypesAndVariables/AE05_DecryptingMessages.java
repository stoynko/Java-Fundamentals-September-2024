package B_DataTypesAndVariables;

import java.util.Scanner;

public class AE05_DecryptingMessages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte key = Byte.parseByte(scanner.nextLine());
        byte inputCount = Byte.parseByte(scanner.nextLine());
        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 1; i <= inputCount; i++) {

            char currentChar = scanner.next().charAt(0);
            byte ASCII = (byte) currentChar;
            char newChar = (char) ((byte) (key + ASCII));
            decryptedMessage.append(newChar);
        }
        System.out.println(decryptedMessage);
    }
}
