package hexlet.code;

public class Utils {
    static final int MIN = 1;
    static final int MAX = 100;

    public static int randomNumber() {
        int randomNumber = (int) (Math.random() * (MAX - MIN)) + MIN;

        return randomNumber;
    }

    public static int randomNumber(int min, int max) {
        int randomNumber = (int) (Math.random() * ((max - min) + 1)) + min;

        return randomNumber;
    }
}
