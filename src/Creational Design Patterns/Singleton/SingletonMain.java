public class SingletonMain {
   public static void main(String[] args) {
       EagerInitialization eagerInitialization = EagerInitialization.getInstance();
       System.out.println(eagerInitialization);

       verifyIfLazyInitializationIsThreadSafe(() -> {
           LazyInitialization lazyInitialization = LazyInitialization.getInstance();
           System.out.println("Lazy Initialization Instance HashCode: " + lazyInitialization.hashCode());
       });

       verifyIfLazyInitializationIsThreadSafe(() -> {
           SynchronizedLazyInitialization synchronizedLazyInitialization = SynchronizedLazyInitialization.getInstance();
           System.out.println("Thread safe Synchronized Lazy Initialization Instance HashCode: " + synchronizedLazyInitialization.hashCode());
       });

       verifyIfLazyInitializationIsThreadSafe(() -> {
           DoubleCheckedLazyInitialization doubleCheckedLazyInitialization = DoubleCheckedLazyInitialization.getInstance();
           System.out.println("Thread safe Double Checked Lazy Initialization Instance HashCode: " + doubleCheckedLazyInitialization.hashCode());
       });

       verifyIfLazyInitializationIsThreadSafe(() -> {
           BillPughLazyInitialization billPughLazyInitialization = BillPughLazyInitialization.getInstance();
           System.out.println("Thread safe Bill Pugh Lazy Initialization Instance HashCode: " + billPughLazyInitialization.hashCode());
       });
   }

   private static void verifyIfLazyInitializationIsThreadSafe(Runnable task) {
       Thread t1 = new Thread(task);
       Thread t2 = new Thread(task);
       Thread t3 = new Thread(task);

       t1.start();
       t2.start();
       t3.start();
   }
}
