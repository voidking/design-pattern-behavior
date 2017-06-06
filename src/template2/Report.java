package template2;

public abstract class Report
{
    public void print()
    {
        printTitle();
        printBody();
        printTail();
    }

    public abstract void printTitle();

    public abstract void printBody();

    public abstract void printTail();
}
