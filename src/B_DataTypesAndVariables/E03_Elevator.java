package B_DataTypesAndVariables;

import java.util.Scanner;

public class E03_Elevator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte persons = Byte.parseByte(scanner.nextLine());
        byte capacity = Byte.parseByte(scanner.nextLine());

        float count = persons / (float) capacity;
        System.out.printf("%.0f", Math.ceil(count));

    }
}
