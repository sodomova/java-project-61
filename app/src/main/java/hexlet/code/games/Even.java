package hexlet.code.games;

import hexlet.code.Util;

public class Even {
    //private String gameCondition;
    private static int question;

    public static String getGameCondition() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static int getQuestion() {
        return question;
    }

    public static void setQuestion() {
        question = Util.randomNumber();
    }

    public static String getCorrectAnswer() {
        return (question % 2 == 0) ? "yes" : "no";
    }
}
