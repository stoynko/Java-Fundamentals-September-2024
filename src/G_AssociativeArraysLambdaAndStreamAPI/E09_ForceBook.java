package G_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class E09_ForceBook {

    public static void main(String[] args) {

        /*The force users are struggling to remember which side is the different forceUsers from because they switch them too often.
        So you are tasked to create a web application to manage their profiles. You will receive several input lines in one of the following formats:
        "{force_side} | {force_user}"
        "{force_user} -> {force_side}"

        The "force_user" and "force_side" are strings containing any character.
        If you receive "force_side | force_user":
            •	If there is no such force user and no such force side -> create a new force side and add the force user to the corresponding side.
            •	Only if there is no such force user on any force side -> add the force user to the corresponding side.
            •	If there is such force user already -> skip the command and continue to the next operation.
        If you receive a "force_user -> force_side":
            •	If there is such force user already -> change their side.
            •	If there is no such force user on any force side -> add the force user to the corresponding force side.
            •	If there is no such force user and no such force side -> create a new force side and add the force user to the corresponding side.
            •	Then you should print on the console: "{force_user} joins the {force_side} side!".

        You should end your program when you receive the command "Lumpawaroo". At that point, you should print each force side.
        For each side, print the force users. In case there are no force users on a side, you shouldn't print the side information.

        Input / Constraints:
            •	The input comes in the form of commands in one of the formats specified above.
            •	The input ends when you receive the command "Lumpawaroo".
        Output:
            •	As output for each force side, you must print all the force users.
            •	The output format is:
        "Side: {forceSide}, Members: {forceUsers.Count}
        ! {forceUser}
        ! {forceUser}
        ! {forceUser}"
        •	In case there are NO forceUsers, don't print this side.*/

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map <String, List<String>> teams = new LinkedHashMap<>();
        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {

            /*• If there is no such force user and no such force side -> create a new force side and add the force user to the corresponding side.
              • Only if there is no such force user on any force side -> add the force user to the corresponding side.
              • If there is such force user already -> skip the command and continue to the next operation.*/

                String[] inputData = input.split("\\|");
                String side = inputData[0];
                String user = inputData[1];

                teams.forEach((currentSide, currentUser) -> {

                });
                if (!teams.containsKey(team) && !teams.get(team).contains(player)){
                    teams.put(team, new ArrayList<>());
                    teams.get(team).add(player);
                } else if ()












            } else if (input.contains("->")) {
                String[] inputData = input.split("\\|");
                String player = inputData[0];
                String team = inputData[1];

            }


            input = scanner.nextLine();
        }

    }
}
