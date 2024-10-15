package D_Methods;

import java.util.Scanner;

public class L06_CalculateRectangleArea {

    public static void main(String[] args) {

        //Create a method that calculates and returns the area of a rectangle by given width and length.

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println(CalculateRectangleArea(width, length));
    }

    private static int CalculateRectangleArea(int width, int length) {
        return width * length;
    }
}
