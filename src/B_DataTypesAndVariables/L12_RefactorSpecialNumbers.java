package B_DataTypesAndVariables;

import java.util.Scanner;

public class L12_RefactorSpecialNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int current = 0;
        boolean isSpecial = false;

        for (int i = 1; i <= n; i++) {
            current = i;

            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            String result = "";
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);

            if (isSpecial) {
                result = "True";
            } else {
                result = "False";
            }
            System.out.printf("%d -> %s%n", current, result);
            sum = 0;
            i = current;

        }
    }
}
