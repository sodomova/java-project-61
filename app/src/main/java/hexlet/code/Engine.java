package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
public class Engine {
    public static void play(int userChoice) {
        final int MOVES = 3;
        String gameCondition = "";

        Cli.greet();

        switch (userChoice) {
            case 2 :
                gameCondition = Even.getGameCondition();
                break;
            case 3 :
                gameCondition = Calc.getGameCondition();
                break;
            case 4 :
                gameCondition = GCD.getGameCondition();
                break;
        }

        System.out.println(gameCondition);

        for (int i = 0; i < MOVES; i++) {
            String question = "";
            String correctAnswer = "";

            switch (userChoice) {
                case 2 :
                    Even.setQuestion();
                    question = Even.getQuestion();
                    correctAnswer = Even.getCorrectAnswer();
                    break;
                case 3 :
                    Calc.setQuestion();
                    question = Calc.getQuestion();
                    correctAnswer = Calc.getCorrectAnswer();
                    break;
                case 4 :
                    GCD.setQuestion();
                    question = GCD.getQuestion();
                    correctAnswer = GCD.getCorrectAnswer();
                    break;
            }

            System.out.print("Question: " + question);
            System.out.print("\nYour answer: ");

            Scanner in = new Scanner(System.in);
            String userAnswer = in.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + Cli.getUserName() + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}
