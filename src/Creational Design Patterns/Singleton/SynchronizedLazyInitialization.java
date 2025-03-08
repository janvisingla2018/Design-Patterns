//Thread-safe
//Slow due to method synchronization because it locks every time.
public class SynchronizedLazyInitialization {
    private static SynchronizedLazyInitialization instance;

    private SynchronizedLazyInitialization() {}

    public static synchronized SynchronizedLazyInitialization getInstance() {
        if(instance == null) {
            instance = new SynchronizedLazyInitialization();
        }

        return instance;
    }
}
