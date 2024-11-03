package G_AssociativeArraysLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class L01_CountRealNumbers {

    public static void main(String[] args) {

        //Read a list of real numbers and print them in ascending order along with their number of occurrences.

        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> map = new TreeMap<>();

        for (int number : input) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
