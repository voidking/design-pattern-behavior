package observer2;

public class Client
{
    public static void main(String[] args)
    {
        Stock stock = new Stock();
        StockObserver androidClient = new AndroidClient();
        StockObserver computerClient = new ComputerClient();
        stock.add(androidClient);
        stock.add(computerClient);
        
        //stock.remove(androidClient);
        stock.changePrice();
        stock.changeCount();
    }
}
