public class Main1 {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is a log message.");

        // Verify that both references point to the same instance
        System.out.println(logger1 == logger2);  // Output: true
    }
}
