// Not thread-safe (Multiple threads may create different instances)
public class LazyInitialization {
    public static LazyInitialization INSTANCE;

    private LazyInitialization() {}

    public static LazyInitialization getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitialization();
        }
        return INSTANCE;
    }
}
