package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String RULE_OF_GAME = "Find the greatest common divisor of given numbers.";

    public static void startPlaying() {
        String[][] gameData = new String[Engine.MOVES][2];

        for (int i = 0; i < Engine.MOVES; i++) {
            gameData[i] = getResultGame();
        }

        Engine.playGame(RULE_OF_GAME, gameData);
    }

    private static String[] getResultGame() {
        int firstNumber = Utils.randomNumber();
        int secondNumber = Utils.randomNumber();

        String question = firstNumber + " " + secondNumber;
        String correctAnswer = Integer.toString(setCorrectAnswer(firstNumber, secondNumber));

        return new String[] {question, correctAnswer};
    }

    private static int setCorrectAnswer(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }

        return firstNumber;
    }
}
