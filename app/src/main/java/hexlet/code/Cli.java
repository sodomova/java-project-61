package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;

    public static String getUserName() {
        return userName;
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner in = new Scanner(System.in);
        userName = in.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}
