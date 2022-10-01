package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static void even() {
        int numberOfMoves = 3;
        Cli.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < numberOfMoves; i++) {
            int number = randomNumber();
            System.out.print("Question: " + number);
            System.out.print("\nYour answer: ");

            Scanner in = new Scanner(System.in);
            String userAnswer = in.nextLine();

            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            if (correctAnswer.equals(userAnswer)) {
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

    public static int randomNumber() {
        int minNumber = 1;
        int maxNumber = 100;

        int randomNumber = (int) (Math.random() * (maxNumber - minNumber)) + minNumber;

        return randomNumber;
    }
}
