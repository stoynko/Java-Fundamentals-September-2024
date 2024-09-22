package B_DataTypesAndVariables;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class L03_ExactSumOfRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal("0");

        for (int i = 1; i <= n; i++) {

            BigDecimal currentNum = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentNum);
        }
        System.out.println(sum);
    }
}
