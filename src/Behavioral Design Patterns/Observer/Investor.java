public class Investor implements Observer {
    String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " received update: " + stockName + " is now $" + price);
    }
}
