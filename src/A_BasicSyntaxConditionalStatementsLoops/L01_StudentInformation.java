package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class L01_StudentInformation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.next());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentName, age, grade);
    }
}
