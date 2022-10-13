package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    final static String RULE_OF_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static int question;

    public static void startPlaying() {
        Engine.playGame("Even");
    }

    public static String getRuleOfGame() {
        return RULE_OF_GAME;
    }

    public static String getQuestion() {
        return Integer.toString(question);
    }

    public static String getCorrectAnswer() {
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
