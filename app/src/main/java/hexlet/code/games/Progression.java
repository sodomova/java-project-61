package hexlet.code.games;

import hexlet.code.Util;

public class Progression {
    private static String question;
    private static String correctAnswer;
    public static String getGameCondition() {
        return "What number is missing in the progression?";
    }

    public static String getQuestion() {
        return question;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static void setResult() {
        int[] progressions = createProgressing();
        String[] numbersForQuestion = new String[progressions.length];

        int number = Util.randomNumber(0, progressions.length - 1);

        for (int i = 0; i < progressions.length; i++) {
            numbersForQuestion[i] = (i == number) ? ".." : Integer.toString(progressions[i]);
        }

        question = String.join(" ", numbersForQuestion);
        correctAnswer = Integer.toString(progressions[number]);
    }

    public static int[] createProgressing() {
        final int MIN_LENGTH = 5;
        final int MAX_LENGTH = 10;
        final int MAX_DELTA = 10;
        final int MAX_FIRST_NUMBER = 20;

        int[] progressions = new int[Util.randomNumber(MIN_LENGTH, MAX_LENGTH)];

        int delta = Util.randomNumber(1, MAX_DELTA);
        progressions[0] = Util.randomNumber(0, MAX_FIRST_NUMBER);

        for (int i = 1; i < progressions.length; i++) {
            progressions[i] = progressions[i - 1] + delta;
        }

        return progressions;
    }
}
