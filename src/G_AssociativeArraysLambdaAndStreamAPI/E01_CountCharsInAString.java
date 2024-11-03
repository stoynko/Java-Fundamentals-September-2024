package G_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class E01_CountCharsInAString {

    public static void main(String[] args) {

        /*Write a program that counts all characters in a string except space (' '). Print all occurrences in the following format: "{char} -> {occurrences}"*/

        Scanner scanner = new Scanner(System.in);
        String[] characters = Arrays.stream(scanner.nextLine().split("")).filter(c -> !c.equals(" ")).toArray(String[]::new);
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String character : characters) {
            if (!map.containsKey(character)) {
                map.put(character, 1);
            } else {
                map.put(character, map.get(character) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
