package B_DataTypesAndVariables;

import java.util.Scanner;

public class L05_ConcatNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameA = scanner.nextLine();
        String nameB = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = nameA + delimiter + nameB;
        System.out.println(result);
    }
}
