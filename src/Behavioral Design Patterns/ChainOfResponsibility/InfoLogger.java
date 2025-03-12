public class InfoLogger extends Logger {

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("[INFO] " + message);
    }
}
