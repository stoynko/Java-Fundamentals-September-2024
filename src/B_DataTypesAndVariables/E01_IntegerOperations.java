package B_DataTypesAndVariables;

import java.util.Scanner;

public class E01_IntegerOperations {

    public static void main(String[] args) {

        /*Read four integer numbers. Add the first to the second, divide (integer) the sum by the third number,
        and multiply the result by the fourth number. Print the result.

        Constraints:
            •	The four numbers from the input are in the range [-2,147,483,648… 2,147,483,647].*/

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        int result = ((num1 + num2) / num3) * num4;
        System.out.println(result);
    }
}
