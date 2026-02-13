package day24;

public class Browsers
{
    private   void checkRAM()
    {
        System.out.println("Checking RAM of System......");
    }

    private  void checkBrowserVersion()
    {
        System.out.println("Checking Browser version......");
    }

    private  void OS()
    {
        System.out.println("Checking OS of System......");
    }

    private  void checkBrowserMicroservices()
    {
        System.out.println("Checking browser Microservices of System......");
    }

    public  void launchBrowser()
    {
        OS();
        checkRAM();
        checkBrowserVersion();
        checkBrowserMicroservices();
        System.out.println("launching the browser......");
    }
}
