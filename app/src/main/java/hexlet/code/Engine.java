package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;
public class Engine {
    public static void play(int userChoice) {
        final int MOVES = 3;

        Cli.greet();

        System.out.println(Even.getGameCondition());

        for (int i = 0; i < MOVES; i++) {
            Even.setQuestion();
            System.out.print("Question: " + Even.getQuestion());
            System.out.print("\nYour answer: ");

            Scanner in = new Scanner(System.in);
            String userAnswer = in.next();

            //String correctAnswer = (Even.calculateTheEven() % 2 == 0) ? "yes" : "no";

            if (userAnswer.equals(Even.getCorrectAnswer())) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + Even.getCorrectAnswer() + "'.\n"
                        + "Let's try again, " + Cli.getUserName() + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}
