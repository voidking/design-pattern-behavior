package template;

public class Report {
	public void print()
    {
        printTitle();
        printBody();
        printTail();
    }
	
	public void printTitle()
    {
        System.out.println("采用一种方式打印表头");
    }

    public void printBody()
    {
        System.out.println("采用一种方式打印正文");
    }

    public void printTail()
    {
        System.out.println("采用一种方式打印表尾");
    }
}
