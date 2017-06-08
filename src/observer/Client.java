package observer;

public class Client
{
    public static void main(String[] args)
    {
        Stock stock = new Stock();
        stock.changePrice();
        stock.changeCount();
    }
}
