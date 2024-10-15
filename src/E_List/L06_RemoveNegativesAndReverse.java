package E_List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L06_RemoveNegativesAndReverse {

    public static void main(String[] args) {

        //Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order.
        // In case of no elements left in the list, print "empty".

        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).filter(n -> n > 0).collect(Collectors.toList());

        if (integerList.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(integerList);
            System.out.println(integerList.toString().replaceAll("[\\[\\],]", "").trim());
        }
    }
}
