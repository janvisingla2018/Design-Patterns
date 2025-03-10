import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{
    String stockName;
    double price;
    List<Observer> observers;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }

    public void setPrice(double newPrice) {
        System.out.println("\nStock " + stockName + " price updated to " + newPrice);
        this.price = newPrice;
        notifyObservers();
    }
}
