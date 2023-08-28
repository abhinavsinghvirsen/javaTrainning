package abhinav.designPattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements StockMarketSubject{

    private List<InvestorObserver> observers = new ArrayList<>();
    private double stockPrice ;

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObserver();
    }

    @Override
    public void registerObserver(InvestorObserver observer) {

        observers.add(observer);

    }

    @Override
    public void removeObserver(InvestorObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

        for (InvestorObserver ob:observers){

            ob.update(stockPrice);
        }

    }
}
