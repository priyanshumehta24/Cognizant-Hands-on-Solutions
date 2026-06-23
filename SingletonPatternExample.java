class Logger {

    private static Logger instance;

    private Logger() {
        System.out.println("Logger instance created.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

public class SingletonPatternExample {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("User logged in.");
        logger3.log("Processing request.");

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("Same Logger instance used everywhere.");
        } else {
            System.out.println("Different instances found!");
        }
    }
}