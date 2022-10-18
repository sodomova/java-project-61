package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String RULE_OF_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startPlaying() {
        String[][] gameData = new String[Engine.MOVES][2];

        for (int i = 0; i < Engine.MOVES; i++) {
            gameData[i] = getResultGame();
        }

        Engine.playGame(RULE_OF_GAME, gameData);
    }

    private static String[] getResultGame() {
        int number = Utils.randomNumber();

        String question = Integer.toString(number);
        String correctAnswer = (isPrime(number) ? "yes" : "no");

        return new String[] {question, correctAnswer};
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
