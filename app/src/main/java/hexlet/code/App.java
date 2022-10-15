package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();

        processUserChoice(userChoice);

        scanner.close();
    }

    private static void processUserChoice(String userChoice) {
        switch (userChoice) {
            case "1" :
                Cli.greet();
                break;
            case "2" :
                Even.startPlaying();
                break;
            case "3" :
                Calc.startPlaying();
                break;
            case "4" :
                GCD.startPlaying();
                break;
            case "5" :
                Progression.startPlaying();
                break;
            case "6" :
                Prime.startPlaying();
                break;
            case "0" :
                break;
            default :
                throw new RuntimeException("Options " + userChoice + " does not exist. Try again.");
        }
    }
}
