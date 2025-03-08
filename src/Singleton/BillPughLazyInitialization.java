// Lazy-loaded, Thread-safe, Fast (Best practice)
public class BillPughLazyInitialization {
    private BillPughLazyInitialization() {}

    private static class BillPughLazyInitializationHelper {
        private static final BillPughLazyInitialization INSTANCE = new BillPughLazyInitialization();
    }

    public static BillPughLazyInitialization getInstance() {
        return BillPughLazyInitializationHelper.INSTANCE;
    }
}
