package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String RULE_OF_GAME = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void startPlaying() {
        Engine.playGame("Calc");
    }

    public static String[] getResultGame() {
        int firstNumber = Utils.randomNumber();
        int secondNumber = Utils.randomNumber();
        int indexOperator = Utils.randomNumber(0, OPERATORS.length - 1);
        char operator = OPERATORS[indexOperator];

        String question = firstNumber + " " + operator + " " + secondNumber;
        String correctAnswer = Integer.toString(calculate(firstNumber, secondNumber, operator));

        return new String[] {question, correctAnswer};
    }

    private static int calculate(int firstNumber, int secondNumber, char operator) {
        switch (operator) {
            case '+' :
                return firstNumber + secondNumber;
            case '-' :
                return firstNumber - secondNumber;
            case '*' :
                return firstNumber * secondNumber;
            default:
                throw new RuntimeException("Unknown operator" + operator);
        }
    }
}
