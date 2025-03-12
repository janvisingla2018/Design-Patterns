public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Logger loggerChain = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        loggerChain.logMessage("Application started.", LogLevel.INFO);
        loggerChain.logMessage("Debugging issue with database.", LogLevel.DEBUG);
        loggerChain.logMessage("System crashed!", LogLevel.ERROR);
    }
}
