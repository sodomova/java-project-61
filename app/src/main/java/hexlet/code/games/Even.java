package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String RULE_OF_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startPlaying() {
        Engine.playGame("Even");
    }

    private static boolean isEven(int question) {
        return question % 2 == 0;
    }

    public static String[] getResultGame() {
        int number = Utils.randomNumber();

        String question = Integer.toString(number);
        String answer = isEven(number) ? "yes" : "no";

        return new String[] {question, answer};
    }
}
