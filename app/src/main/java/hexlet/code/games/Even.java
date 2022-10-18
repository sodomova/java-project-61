package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String RULE_OF_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startPlaying() {
        String[][] gameData = new String[Engine.MOVES][2];

        for (int i = 0; i < Engine.MOVES; i++) {
            gameData[i] = getResultGame();
        }

        Engine.playGame(RULE_OF_GAME, gameData);
    }

    private static boolean isEven(int question) {
        return question % 2 == 0;
    }

    private static String[] getResultGame() {
        int number = Utils.randomNumber();

        String question = Integer.toString(number);
        String answer = isEven(number) ? "yes" : "no";

        return new String[] {question, answer};
    }
}
