package A_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class AE05_Messages {
    public static void main(String[] args) {

        /*Write a program that emulates typing an SMS, following this guide:

         1	   2     3
              abc	def
         4     5     6
        ghi   jkl   mno
         7     8     9
        pqrs  tuv   wxyz
               0
             space

        Following the guide, 2 becomes "a", 22 becomes "b" and so on.*/


        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        //Find the number of digits the number has "e.g. 222 -> 3 digits"

        //Find the main digit of the number "e.g.  222 -> 2"

        //Find the offset of the number. To do that, you can use the formula: (main digit - 2) * 3

        //If the main digit is 8 or 9, we need to add 1 to the offset since the digits 7 and 9 have 4 letters each

        //Finally, find the letter index (a -> 0, c -> 2, etc.). To do that, we can use the following formula: (offset + digit length - 1).

        //After we've found the letter index, we can just add that to the ASCII code of the lowercase letter "a" (97)

    }
}
