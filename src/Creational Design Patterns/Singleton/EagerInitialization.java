//Simple and Thread safe
//Instance is created even if never used
public class EagerInitialization {
    private static final EagerInitialization INSTANCE = new EagerInitialization();

    private EagerInitialization() {}

    public static EagerInitialization getInstance() {
        return INSTANCE;
    }
}
