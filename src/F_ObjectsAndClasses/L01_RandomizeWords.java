package F_ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L01_RandomizeWords {

    public static void main(String[] args) {

        //You are given a list of words in one line. Randomize their order and print each word on a separate line.

        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!words.isEmpty()) {
            int randomIndex = randomNumber.nextInt(words.size());
            System.out.println(words.get(randomIndex));
            words.remove(randomIndex);
        }
    }
}
