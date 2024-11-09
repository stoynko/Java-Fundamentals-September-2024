package G_AssociativeArraysLambdaAndStreamAPI;

import com.sun.source.tree.*;

import java.util.*;

public class AE01_Ranking {

    public static void main(String[] args) {

 /*Here comes the final and the most interesting part - the Final ranking of the candidate interns.
 The final ranking is determined by the points of the interview tasks and from the exams in SoftUni.
 Here is your final task.  You will receive some lines of input in the format "{contest}:{password for contest}" until you receive "end of contests".
 Save that data because you will need it later.  After that, you will receive another type of input in the format:

  "{contest}=>{password}=>{username}=>{points}" until you receive "end of submissions".

 Here is what you need to do:
    •	Check if the contest is valid (if you received it in the first type of input);
    •	Check if the password is correct for the given contest;
    •	Save the user with the contest they take part in (a user can take part in many contests) and the points the user has in the given contest.
    If you receive the same contest and the same user, update the points only if the new ones are more than the older ones.
 In the end, you have to print the info for the user with the most points in the format "Best candidate is {user} with total {total points} points.".
 After that, print all students ordered by their names. For each user, print each contest with the points in descending order. See the examples.
 Input:
    •	Strings in format "{contest}:{password for contest}" until the "end of contests" command. There will be no case with two equal contests.
    •	Strings in format "{contest}=>{password}=>{username}=>{points}" until the "end of submissions" command.
    •	There will be no case with 2 or more users with the same total points!
 Output:
    •	On the first line, print the best user in a format:
        "Best candidate is {user} with total {total points} points.".
    •	Then print all students ordered as mentioned above in format:
        "{user1 name}
        #  {contest1} -> {points}
        #  {contest2} -> {points}"
 Constraints:
    •	The strings may contain any ASCII character except (:, =, >).
    •	The numbers will be in the range [0 - 10000].
    •	The second input is always valid.*/

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> passwordMap = new LinkedHashMap<>();
        HashMap<String, List<String>> contestMap = new LinkedHashMap<>();
        HashMap<String, List<Integer>> resultsMap = new LinkedHashMap<>();
        String input = scanner.nextLine();


        while (!input.equals("end of contests")) {

            /*Input:
            •	Strings in format "{contest}:{password for contest}" until the "end of contests" command. There will be no case with two equal contests.
            •	Strings in format "{contest}=>{password}=>{username}=>{points}" until the "end of submissions" command.
            •	There will be no case with 2 or more users with the same total points!*/
            String contest = input.split(":")[0];
            String password = input.split(":")[1];
            passwordMap.putIfAbsent(contest, password);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {

            String contest = input.split("=>")[0];
            String password = input.split("=>")[1];
            String username = input.split("=>")[2];
            int points = Integer.parseInt(input.split("=>")[3]);

            // Регистрирам кой къде е участвал

            for (Map.Entry<String, String> entry : passwordMap.entrySet()) {
                if (entry.getKey().equals(contest) && entry.getValue().equals(password)) {
                    contestMap.putIfAbsent(username, new ArrayList<>());
                    contestMap.get(username).add(contest);
                    resultsMap.putIfAbsent(username, new ArrayList<>());
                    break;
                }
            }
            for (int index = 0; index < contestMap.size(); index++) {

                if (resultsMap.get(username).isEmpty() || contestMap.get(username).size() > resultsMap.get(username).size()) {
                    if (contestMap.get(username).get(index).equals(contest) && !resultsMap.get(username).isEmpty()) {
                        resultsMap.get(username).set(index, points);
                    } else {
                        resultsMap.get(username).add(points);
                    }
                }
                input = scanner.nextLine();
            }

        }
    }
}
