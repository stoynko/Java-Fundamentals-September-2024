package E_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_BombNumbers {

    public static void main(String[] args) {

        /*Write a program that reads a sequence of numbers and a special bomb number with a certain power.
        Your task is to detonate every occurrence of the special bomb number and according to its power - his neighbors from left and right.
        Detonations are performed from left to right, and all detonated numbers disappear. Finally, print the sumElements of the remaining elements in the sequence.*/

        Scanner scanner = new Scanner(System.in);

        List<Integer> integersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] specialSequence = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int bombNumber = specialSequence[0];
        int bombPower = specialSequence[1];

        while (integersList.contains(bombNumber)) {

            int target = integersList.indexOf(bombNumber);
            int leftRange = target - bombPower;
            int rightRange = target + bombPower;
            if (leftRange < 0) {
                leftRange = 0;
            }
            if (rightRange > integersList.size() - 1) {
                rightRange = integersList.size() - 1;
            }
            int elementsWithinRange = rightRange - leftRange;
            integersList.remove(target);
            while (elementsWithinRange > 0) {
                integersList.remove(leftRange);
                elementsWithinRange--;
            }
        }
        int sumElements = 0;
        for (int integer : integersList) {
            sumElements += integer;
        }
        System.out.println(sumElements);
    }
}