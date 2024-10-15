package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class L11_EvenNumber {
    public static void main(String[] args) {

        /*Take as an input an even number and print its absolute value with a message: "The number is: {absoluteValue}".
        If the number is odd, print "Please write an even number." and continue reading numbers.*/

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean isOdd = true;

        while (isOdd) {

            number = Integer.parseInt(scanner.next());
            if (number % 2 == 0) {
                isOdd = false;
                number = Math.abs(number);
                System.out.printf("The number is: %d", number);
            } else
                System.out.println("Please write an even number.");
        }
    }
}
