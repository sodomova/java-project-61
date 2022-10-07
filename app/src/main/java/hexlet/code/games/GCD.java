package hexlet.code.games;

import hexlet.code.Util;

public class GCD {
    private static String question;
    private static int correctAnswer;

    public static String getGameCondition() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String getQuestion() {
        return question;
    }

    public static String getCorrectAnswer() {
        return Integer.toString(correctAnswer);
    }

    public static void setResult() {
        int firstNumber = Util.randomNumber();
        int secondNumber = Util.randomNumber();
        question = firstNumber + " " + secondNumber;
        setCorrectAnswer(firstNumber, secondNumber);
    }

    public static void setCorrectAnswer(int firstNumber, int secondNumber) {
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
