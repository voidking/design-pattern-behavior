package template2;

public class Client
{
    public static void main(String[] args)
    {
        Report report = new ReportImpl();
        report.print();

        System.out.println("**********");

        report = new ReportImpl2();
        report.print();

    }
}