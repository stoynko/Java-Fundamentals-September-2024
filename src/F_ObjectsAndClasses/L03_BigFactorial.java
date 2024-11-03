package F_ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class L03_BigFactorial {

    public static void main(String[] args) {
        //You will receive N - the number in the range [0 - 1000]. Calculate the Factorial of N and print the result.

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}