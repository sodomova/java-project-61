package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String RULE_OF_GAME = "What number is missing in the progression?";

    public static void startPlaying() {
        Engine.playGame("Progression");
    }

    public static String[] getResultGame() {
        final int minLength = 5;
        final int maxLength = 10;
        final int maxDelta = 10;
        final int maxFirstNumber = 20;

        int firstNumber = Utils.randomNumber(0, maxFirstNumber);
        int delta = Utils.randomNumber(1, maxDelta);
        int progressionLength = Utils.randomNumber(minLength, maxLength);
        int number = Utils.randomNumber(0, progressionLength - 1);
        String correctAnswer = "";

        String[] progressions = createProgressing(firstNumber, delta, progressionLength);

        for (int i = 0; i < progressionLength; i++) {
            if (i == number) {
                correctAnswer = progressions[i];
                progressions[i] = "..";
            }
        }

        String question = String.join(" ", progressions);

        return new String[] {question, correctAnswer};
    }

    private static String[] createProgressing(int firstNumber, int delta, int progressionLength) {
        String[] progressions = new String[progressionLength];

        for (int i = 0; i < progressions.length; i++) {
            progressions[i] = Integer.toString(firstNumber + i * delta);
        }

        return progressions;
    }
}
