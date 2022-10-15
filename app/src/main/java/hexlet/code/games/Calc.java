package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    public static final String RULE_OF_GAME = "What is the result of the expression?";
    private static String question;
    private static int correctAnswer;

    public static void startPlaying() {
        Engine.playGame("Calc");
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
        final int numberOfArithmeticOperators = 3;

        int firstNumber = Util.randomNumber();
        int secondNumber = Util.randomNumber();
        String arithmeticOperation = Integer.toString(Util.randomNumber(1, numberOfArithmeticOperators));
        char arithmeticOperationSymbol;

        switch (arithmeticOperation) {
            case "1" :
                arithmeticOperationSymbol = '+';
                break;
            case "2" :
                arithmeticOperationSymbol = '-';
                break;
            case "3" :
                arithmeticOperationSymbol = '*';
                break;
            default:
                throw new RuntimeException("The value of " + arithmeticOperation
                        + " does not match the list of possible values. Possible values: 1, 2, 3.");
        }

        calculate(firstNumber, secondNumber, arithmeticOperationSymbol);
    }

    private static void calculate(int firstNumber, int secondNumber, char arithmeticOperationSymbol) {
        switch (arithmeticOperationSymbol) {
            case '+' :
                question = firstNumber + " + " + secondNumber;
                correctAnswer = firstNumber + secondNumber;
                break;
            case '-' :
                question = firstNumber + " - " + secondNumber;
                correctAnswer = firstNumber - secondNumber;
                break;
            case '*' :
                question = firstNumber + " * " + secondNumber;
                correctAnswer = firstNumber * secondNumber;
                break;
            default:
                throw new RuntimeException("Unknown operator" + arithmeticOperationSymbol);
        }
    }
}
