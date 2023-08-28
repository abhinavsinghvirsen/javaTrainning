package abhinav.designPattern.behavioral.observer;

public class Investor implements  InvestorObserver{
    private  String name;
    private  StockMarketSubject stockMarket;

    public Investor(String name, StockMarketSubject stockMarket) {
        this.name = name;
        this.stockMarket = stockMarket;
        stockMarket.registerObserver(this);
    }

    @Override
    public void update(double stockPrice) {

        System.out.println("Hi  "+this.name+"  update stock price == > "+stockPrice);

    }
}
