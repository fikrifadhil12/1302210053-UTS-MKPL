public class SmallIntegerException extends Exception {
    private static int totalExceptions = 0;

    public SmallIntegerException(String message) {
        super(message);
        totalExceptions++;
    }

    public static int getTotalExceptions() {
        return totalExceptions;
    }

    public void print() {
        System.out.println("Small Integer Exception: " + getMessage());
    }

    public static void resetTotalExceptions() {
        totalExceptions = 0;
    }
}