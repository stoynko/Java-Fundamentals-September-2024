package G_AssociativeArraysLambdaAndStreamAPI;

import java.util.Scanner;

public class E04_SoftUniParking {

    public static void main(String[] args) {

        /*SoftUni just got a new parking lot. It's so fancy, it even has online parking validation. Except, the online service doesn't work.
        It can only receive users' data but doesn't know what to do with it. Good thing you're on the dev team and know how to fix it, right?
        Write a program that validates parking for an online service. Users can register to park and unregister to leave. The program receives 2 commands:
            •	"register {username} {licensePlateNumber}":

                o	The system only supports one car per user at the moment, so if a user tries to register another license plate using the same username,
                the system should print: "ERROR: already registered with plate number {licensePlateNumber}"
                o	If the aforementioned checks pass successfully, the plate can be registered, so the system should print:
                "{username} registered {licensePlateNumber} successfully"

            •	"unregister {username}":
                o	If the user is not present in the database, the system should print:
                "ERROR: user {username} not found"
                o	If the aforementioned check passes successfully, the system should print:
                "{username} unregistered successfully"

        After you execute all of the commands, print all the currently registered users and their license plates in the format: "{username} => {licensePlateNumber}"*/

        Scanner scanner = new Scanner(System.in);
    }
}
