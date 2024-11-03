package A_BasicSyntaxConditionalStatementsLoops;

public class L08_DivisibleByThree {
    public static void main(String[] args) {

        /*Write a program that prints all the numbers from 1 to 100, which are divisible by 3.
        You have to use a single for loop. The program should not receive input.*/

        for (int i = 3; i <= 99; i += 3) {
            System.out.println(i);
        }
    }
}
