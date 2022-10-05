package hexlet.code.games;

import hexlet.code.Util;

public class Calc {
    private static String question;
    private static int correctAnswer;

    public static void setQuestion() {
        int firstNumber = Util.randomNumber();
        int secondNumber = Util.randomNumber();
        int arithmeticOperation = Util.randomNumber(1, 3);

        switch (arithmeticOperation) {
            case 1 :
                correctAnswer = firstNumber + secondNumber;
                question = firstNumber + " + " + secondNumber;
                break;
            case 2 :
                correctAnswer = firstNumber - secondNumber;
                question = firstNumber + " - " + secondNumber;
                break;
            case 3 :
                correctAnswer = firstNumber * secondNumber;
                question = firstNumber + " * " + secondNumber;
                break;
        }
    }

    public static String getGameCondition() {
        return "What is the result of the expression?";
    }

    public static String getQuestion() {
        return question;
    }

    public static String getCorrectAnswer() {
        return Integer.toString(correctAnswer);
    }
}
