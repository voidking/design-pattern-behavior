package observer;

public class Stock
{
    private String stockName = "中信证券";
    
    public void changeCount()
    {
    	ComputerClient computerClient = new ComputerClient();
        computerClient.updateCount(stockName);
        
        AndroidClient androidClient = new AndroidClient();
        androidClient.updateCount(stockName);
    }

    public void changePrice()
    {
    	ComputerClient computerClient = new ComputerClient();
        computerClient.updatePrice(stockName);
        
        AndroidClient androidClient = new AndroidClient();
        androidClient.updatePrice(stockName);
    }
}
