package template2;

public class ReportImpl2 extends Report
{
    public void printTitle()
    {
        System.out.println("采用另外一种方式打印表头");
    }

    public void printBody()
    {
        System.out.println("采用另外一种方式打印正文");
    }

    public void printTail()
    {
        System.out.println("采用另外一种方式打印表尾");
    }
}
