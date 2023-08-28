package abhinav.designPattern.behavioral.observer;

public interface StockMarketSubject {

    void registerObserver(InvestorObserver observer);
    void removeObserver(InvestorObserver observer);
    void notifyObserver();


}
