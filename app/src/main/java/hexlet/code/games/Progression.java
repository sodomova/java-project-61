package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    public static final String RULE_OF_GAME = "What number is missing in the progression?";
    private static String question;
    private static String correctAnswer;

    public static void startPlaying() {
        Engine.playGame("Progression");
    }

    private static String getQuestion() {
        return question;
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
        final int minLength = 5;
        final int maxLength = 10;
        final int maxDelta = 10;
        final int maxFirstNumber = 20;

        int[] progressions = new int[Util.randomNumber(minLength, maxLength)];

        int firstNumber = Util.randomNumber(0, maxFirstNumber);
        int delta = Util.randomNumber(1, maxDelta);
        int progressionLength = progressions.length;

        progressions = createProgressing(firstNumber, delta, progressionLength);

        String[] numbersForQuestion = new String[progressionLength];

        int number = Util.randomNumber(0, progressionLength - 1);

        for (int i = 0; i < progressions.length; i++) {
            numbersForQuestion[i] = (i == number) ? ".." : Integer.toString(progressions[i]);
        }

        question = String.join(" ", numbersForQuestion);
        correctAnswer = Integer.toString(progressions[number]);
    }

    private static int[] createProgressing(int firstNumber, int delta, int progressionLength) {
        int[] progressions = new int[progressionLength];

        progressions[0] = firstNumber;

        for (int i = 1; i < progressions.length; i++) {
            progressions[i] = progressions[i - 1] + delta;
        }

        return progressions;
    }
}
