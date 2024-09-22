package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class E10_PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalCosts = (Math.ceil(students + (students * 0.1)) * lightsaberPrice) + (students * robePrice) + ((students - (students / 6)) * beltPrice);

        if (totalCosts > balance) {
            double difference = totalCosts - balance;
            System.out.printf("George Lucas will need %.2flv more.", difference);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCosts);
        }
    }
}
