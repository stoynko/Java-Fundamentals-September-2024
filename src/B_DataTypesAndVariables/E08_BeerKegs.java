package B_DataTypesAndVariables;

import java.util.Scanner;

public class E08_BeerKegs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte numberKegs = Byte.parseByte(scanner.nextLine());
        String biggestKeg = "";
        double volumeTemp = Double.MIN_VALUE;
        for (int i = 1; i <= numberKegs; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > volumeTemp) {
                biggestKeg = model;
                volumeTemp = volume;
            }
        }
        System.out.println(biggestKeg);
    }
}
