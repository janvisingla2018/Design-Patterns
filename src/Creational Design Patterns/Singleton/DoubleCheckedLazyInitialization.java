// Best for performance & thread-safety because synchronizing only when needed.
public class DoubleCheckedLazyInitialization {
    private static volatile DoubleCheckedLazyInitialization instance;

    private DoubleCheckedLazyInitialization() {}

    public static DoubleCheckedLazyInitialization getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLazyInitialization.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLazyInitialization();
                }
            }
        }
        return instance;
    }
}
