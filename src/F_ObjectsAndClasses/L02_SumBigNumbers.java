package F_ObjectsAndClasses;

import java.util.Scanner;
import java.math.BigInteger;

public class L02_SumBigNumbers {

    public static void main(String[] args) {

        //You will receive two numbers (0 to 1050), and print their sum

        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());
        BigInteger result = firstNumber.add(secondNumber);
        System.out.println(result);
    }
}