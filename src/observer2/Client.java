package observer2;

public class Client
{
    public static void main(String[] args)
    {
        Stock stock = new Stock();
        stock.add(new AndroidClient());
        stock.add(new ComputerClient());
        stock.changePrice();
        stock.changeCount();
    }
}
