package hexlet.code;

public class Util {
    public static int randomNumber() {
        final int MIN = 1;
        final int MAX = 100;

        int randomNumber = (int) (Math.random() * (MAX - MIN)) + MIN;

        return randomNumber;
    }
}
