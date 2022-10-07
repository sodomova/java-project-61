package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
public class Engine {
    public static void play(int userChoice) {
        final int MOVES = 3;

        Cli.greet();
        System.out.println(getGameCondition(userChoice));

        for (int i = 0; i < MOVES; i++) {
            String[] resultsGame = getResultGame(userChoice);
            String question = resultsGame[0];
            String correctAnswer = resultsGame[1];

            System.out.print("Question: " + question);
            System.out.print("\nYour answer: ");

            Scanner in = new Scanner(System.in);
            String userAnswer = in.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + Cli.getUserName() + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    public static String getGameCondition(int userChoice) {
        String gameCondition = "";

        switch (userChoice) {
            case 2:
                gameCondition = Even.getGameCondition();
                break;
            case 3:
                gameCondition = Calc.getGameCondition();
                break;
            case 4:
                gameCondition = GCD.getGameCondition();
                break;
            case 5:
                gameCondition = Progression.getGameCondition();
                break;
            case 6:
                gameCondition = Prime.getGameCondition();
                break;
            default:
                break;
        }

        return gameCondition;
    }

    public static String[] getResultGame(int userChoice) {
        String[] result = new String[2];

        switch (userChoice) {
            case 2:
                Even.setResult();
                result[0] = Even.getQuestion();
                result[1] = Even.getCorrectAnswer();
                break;
            case 3:
                Calc.setResult();
                result[0] = Calc.getQuestion();
                result[1] = Calc.getCorrectAnswer();
                break;
            case 4:
                GCD.setResult();
                result[0] = GCD.getQuestion();
                result[1] = GCD.getCorrectAnswer();
                break;
            case 5:
                Progression.setResult();
                result[0] = Progression.getQuestion();
                result[1] = Progression.getCorrectAnswer();
                break;
            case 6:
                Prime.setResult();
                result[0] = Prime.getQuestion();
                result[1] = Prime.getCorrectAnswer();
                break;
            default:
                break;
        }

        return result;
    }
}
