package B_DataTypesAndVariables;

import java.util.Scanner;

public class E11_Snowballs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte snowballs = Byte.parseByte(scanner.nextLine());
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;
        long bestValue = 0;

        for (int i = 1; i <= snowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            long snowballValue = (long) Math.pow(((double) snowballSnow / snowballTime),
                    snowballQuality);

            if (snowballValue > bestValue) {
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
                bestValue = snowballValue;
            }
        }
        System.out.printf("%d : %d = %d (%d)",
                bestSnow, bestTime, bestValue, bestQuality);
    }
}
