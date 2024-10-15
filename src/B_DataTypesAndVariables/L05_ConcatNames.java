package B_DataTypesAndVariables;

import java.util.Scanner;

public class L05_ConcatNames {

    public static void main(String[] args) {

        //Read two names and a delimiter. Print the names joined by the delimiter.

        Scanner scanner = new Scanner(System.in);

        String nameA = scanner.nextLine();
        String nameB = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = nameA + delimiter + nameB;
        System.out.println(result);
    }
}
