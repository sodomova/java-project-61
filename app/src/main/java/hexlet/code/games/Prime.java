package hexlet.code.games;

import hexlet.code.Util;

public class Prime {
    private static int question;
    private static String correctAnswer;

    public static String getGameCondition() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String getQuestion() {
        return Integer.toString(question);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static void setResult() {
        question = Util.randomNumber();
        correctAnswer = setCorrectAnswer(question);
    }

    public static String setCorrectAnswer(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if ((number % i) == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
