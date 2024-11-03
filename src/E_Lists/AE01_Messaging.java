package E_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AE01_Messaging {
    public static void main(String[] args) {

        /*You will be given a list of numbers and a string. For each element of the list, you have to take the sum of its digits
         and take the element corresponding to that index from the text. If the index is greater than the length of the text,
         start counting from the beginning (so that you always have a valid index). After getting the element from the text,
         you must remove the character you have taken from it (so for the next index, the text will be with one characterless).*/

        Scanner scanner = new Scanner(System.in);

        List<Integer> integersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> inputList = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        StringBuilder output = new StringBuilder();

        for (int number : integersList) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            int targetIndex = sum % inputList.size();
            output.append(inputList.remove(targetIndex));
        }

        System.out.println(output.toString());
    }
}