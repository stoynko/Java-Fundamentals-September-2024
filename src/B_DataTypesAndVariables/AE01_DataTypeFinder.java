package B_DataTypesAndVariables;

import java.util.Scanner;

public class AE01_DataTypeFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String dataType = "";

        while (!input.equals("END")) {

            byte ASCII = (byte) input.charAt(0);
            boolean isDecimal = false;
            boolean isInvalid = false;
            byte inputCharacters = 0;
            byte minusCounter = 0;
            byte dotCounter = 0;
            for (int i = 0; i < input.length(); i++) {
                inputCharacters++;
            }
            if (input.equals("true") || input.equals("false")) {
                dataType = "boolean";

            } else if ((inputCharacters == 1) && (ASCII >= 32 && ASCII <= 47 || ASCII >= 58 && ASCII <= 126)) {
                dataType = "character";

            } else {
                for (int k = 0; k < inputCharacters; k++) {
                    ASCII = (byte) input.charAt(k);
                    if (ASCII >= 45 && ASCII <= 46 || ASCII >= 48 && ASCII <= 57) { // Does it contain minus, dot or integers? If not -> string
                        if (input.charAt(k) == 45) { // Check if its minus
                            if (k == 0) { // Is the minus at index 0
                                minusCounter++;
                                if (minusCounter > 1) { // If more than one minus -> String
                                    dataType = "string";
                                    break;
                                }
                                continue;
                            }
                            else{
                                dataType = "string";
                                isInvalid = true;
                                isDecimal = false;
                            }

                        }
                        if (input.charAt(k) == 46) { // Check for a dot
                            isDecimal = true;
                            dotCounter++;
                            dataType = "floating point";
                            if (dotCounter > 1) { // If more than one dot -> String
                                dataType = "string";
                                break;
                            }
                            continue;
                        }
                        if (k == inputCharacters - 1 && !isDecimal && !isInvalid) { // Check if I have gone through all the characters
                            dataType = "integer";
                        }
                        if (isDecimal) {
                            dataType = "floating point";
                        }
                    } else {
                        dataType = "string";
                        break;
                    }
                }
            }
            System.out.printf("%s is %s type%n", input, dataType);
            dataType = "";
            input = scanner.nextLine();
        }
    }
}


