public class ObserverMain {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150.0);

        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        appleStock.setPrice(155.5);
        appleStock.setPrice(160.0);

        appleStock.removeObserver(investor1);

        appleStock.setPrice(165.0);
    }
}
