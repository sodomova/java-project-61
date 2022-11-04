package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MOVES = 3;

    public static void playGame(String ruleOfGame, String[][] gameData) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(ruleOfGame);

        for (String[] resultGame : gameData) {
            String question = resultGame[0];
            String correctAnswer = resultGame[1];

            System.out.print("Question: " + question);
            System.out.print("\nYour answer: ");

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
}
