public class ErrorLogger extends Logger {
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("[ERROR] " + message);
    }
}
