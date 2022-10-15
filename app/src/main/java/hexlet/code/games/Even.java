package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static final String RULE_OF_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static int question;

    public static void startPlaying() {
        Engine.playGame("Even");
    }

    private static String getQuestion() {
        return Integer.toString(question);
    }

    private static String getCorrectAnswer() {
        return (question % 2 == 0) ? "yes" : "no";
    }

    public static String[] getResultGame() {
        String[] resultGame = new String[2];

        question = Util.randomNumber();

        resultGame[0] = getQuestion();
        resultGame[1] = getCorrectAnswer();

        return resultGame;
    }
}
