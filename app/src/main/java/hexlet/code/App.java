package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner in = new Scanner(System.in);
        int userChoice = in.nextInt();

        if (userChoice == 1) {
            Cli.greet();
        } else if (userChoice == 2 || userChoice == 3) {
            Engine.play(userChoice);
        }
    }
}
