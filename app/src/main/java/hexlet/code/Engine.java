package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class Engine {
    static final int MOVES = 3;
    private static String userName;

    public static void playGame(String nameGame) {
        greet();
        getRuleOfGame(nameGame);

        for (int i = 0; i < MOVES; i++) {
            String[] resultsGame = getResultGame(nameGame);
            String question = resultsGame[0];
            String correctAnswer = resultsGame[1];

            System.out.print("Question: " + question);
            System.out.print("\nYour answer: ");

            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    private static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    private static void getRuleOfGame(String nameGame) {
        switch (nameGame) {
            case "Even" :
                System.out.println(Even.RULE_OF_GAME);
                break;
            case "Calc" :
                System.out.println(Calc.RULE_OF_GAME);
                break;
            case "GCD" :
                System.out.println(GCD.RULE_OF_GAME);
                break;
            case "Progression" :
                System.out.println(Progression.RULE_OF_GAME);
                break;
            case "Prime" :
                System.out.println(Prime.RULE_OF_GAME
                );
                break;
            default:
                throw new RuntimeException("The game '" + nameGame + "' doesn't exist.");
        }
    }

    private static String[] getResultGame(String nameGame) {
        String[] resultGame = new String[2];

        switch (nameGame) {
            case "Even" :
                resultGame = Even.getResultGame();
                break;
            case "Calc":
                resultGame = Calc.getResultGame();
                break;
            case "GCD":
                resultGame = GCD.getResultGame();
                break;
            case "Progression":
                resultGame = Progression.getResultGame();
                break;
            case "Prime":
                resultGame = Prime.getResultGame();
                break;
            default:
                throw new RuntimeException("The game '" + nameGame + "' doesn't exist.");
        }

        return resultGame;
    }
}
