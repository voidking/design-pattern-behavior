package observer2;

public class AndroidClient implements StockObserver
{
    public void updatePrice(String name)
    {
        System.out.println(name + "股票在安卓上的价格更新了");
    }

    public void updateCount(String name)
    {
        System.out.println(name + "股票在安卓上的买卖数量更新了");
    }
}
