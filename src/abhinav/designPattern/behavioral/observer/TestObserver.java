package abhinav.designPattern.behavioral.observer;

public class TestObserver {

    public static void main(String[] args) {

         StockMarket nse = new StockMarket();
         Investor abhinav = new Investor("abhinav",nse);
         Investor rajiv = new Investor("rajib",nse);



        nse.setStockPrice(10); //notifies both
        nse.setStockPrice(23.5);
        nse.removeObserver(rajiv);
        nse.setStockPrice(300);


    }
}
