package X_MidExam.ExamPrep_V01;

import java.util.Arrays;
import java.util.Scanner;

public class E02_TheLift {

    public static void main(String[] args) {

        /*Write a program that finds a place for the tourist on a lift.
        Every wagon should have a maximum of 4 people on it. If a wagon is full, you should direct the people to the next one with space available.*/

        Scanner scanner = new Scanner(System.in);

        int queueSize = Integer.parseInt(scanner.nextLine());

        int[] lift = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= lift.length - 1; index++) {

            while (lift[index] < 4 && queueSize > 0) {
                lift[index]++;
                queueSize--;
            }
        }

        boolean areSeatsAvailable = Arrays.stream(lift).anyMatch(wagon -> wagon < 4);

        if (queueSize == 0 && areSeatsAvailable) {
            System.out.println("The lift has empty spots!");
        } else if (queueSize > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", queueSize);
        }

        for (int wagon : lift) {
            System.out.printf("%d ", wagon);
        }
    }
}