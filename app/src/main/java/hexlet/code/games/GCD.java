package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    public static final String RULE_OF_GAME = "Find the greatest common divisor of given numbers.";
    private static String question;
    private static int correctAnswer;

    public static void startPlaying() {
        Engine.playGame("GCD");
    }

    private static String getQuestion() {
        return question;
    }

    private static String getCorrectAnswer() {
        return Integer.toString(correctAnswer);
    }

    public static String[] getResultGame() {
        String[] resultGame = new String[2];

        setResultGame();

        resultGame[0] = getQuestion();
        resultGame[1] = getCorrectAnswer();

        return resultGame;
    }

    private static void setResultGame() {
        int firstNumber = Util.randomNumber();
        int secondNumber = Util.randomNumber();

        question = firstNumber + " " + secondNumber;

        setCorrectAnswer(firstNumber, secondNumber);
    }

    private static void setCorrectAnswer(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }

        correctAnswer = firstNumber;
    }
}
