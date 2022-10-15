package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    public static final String RULE_OF_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static int question;
    private static String correctAnswer;

    public static void startPlaying() {
        Engine.playGame("Prime");
    }

    private static String getQuestion() {
        return Integer.toString(question);
    }

    private static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static String[] getResultGame() {
        String[] resultGame = new String[2];

        setResultGame();

        resultGame[0] = getQuestion();
        resultGame[1] = getCorrectAnswer();

        return resultGame;
    }

    private static void setResultGame() {
        question = Util.randomNumber();
        correctAnswer = (isPrime(question) ? "yes" : "no");
    }

    private static boolean isPrime(int number) {
        if (number != 1) {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if ((number % i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
