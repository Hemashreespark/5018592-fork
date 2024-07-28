package observerpackage;

import java.util.ArrayList;
import java.util.List;

// Subject Interface
interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject
class StockMarket implements Stock {
    private List<Observer> observers;
    private double stockPrice;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}

// Observer Interface
interface Observer {
    void update(double stockPrice);
}

// Combined Concrete Observer
class ClientApp implements Observer {
    private String name;
    private String type;

    public ClientApp(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(type + " " + name + ": Stock price updated to " + stockPrice);
    }
}

// Test Class
public class ObserverPatternExample {

    public static void main(String[] args) {
        // Create stock market
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp1 = new ClientApp("App1", "Mobile App");
        Observer mobileApp2 = new ClientApp("App2", "Mobile App");
        Observer webApp1 = new ClientApp("WebApp1", "Web App");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        // Change stock price
        stockMarket.setStockPrice(100.0);

        // Deregister an observer
        stockMarket.deregisterObserver(mobileApp1);

        // Change stock price
        stockMarket.setStockPrice(200.0);
    }
}

