package E_List;

import java.util.*;
import java.util.stream.Collectors;


public class E07_AppendArrays {

    public static void main(String[] args) {

        /*Write a program to append several arrays of numbers.
            	Arrays are separated by "|".
            	Values are separated by spaces (" ", one or several).
            	Order the arrays from the last to the first and their values from left to right.*/

        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(list);
        System.out.println(list.toString().replaceAll("[\\[\\],]", "").replaceAll("\\s+", " ").trim());
    }
}
