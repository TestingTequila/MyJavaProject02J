package day21.Oops_Ploymorphism;

public class Application
{
    //1. By changing the datatype of parameters
    public void addition(int a, int b)
    {
        System.out.println(a+b);
    }

    public void addition(int a, double b)
    {
        System.out.println(a+b);
    }

    public void addition(double a, int b)
    {
        System.out.println(a+b);
    }

    public void addition(double a, float b)
    {
        System.out.println(a+b);
    }

    //1. By changing the order of parameters
    public void addition(float a, double b)
    {
        System.out.println(a+b);
    }

    //1. By changing the count of parameters
    public void addition(float a, double b, int c)
    {
        System.out.println(a+b+c);
    }

    public void login(String email, String password)
    {

    }

    public void login(long mobileNumber)
    {

    }

    public void login(String email, String password, int otp)
    {

    }

    public void login(String fbApi)
    {

    }

    public  void payment(long CcNumber, int Cvv)
    {

    }

    public  void payment(long D, int Cvv, int otp)
    {

    }

    public  void payment(String amazonPay)
    {

    }

    public  void payment(int crypto)
    {

    }

    public  void search(int price)
    {

    }

    public  void search(int price, String brandName)
    {

    }

    public  void search(double cameraResolution)
    {

    }

    public  void search(int price, String brandName, double cameraResolution)
    {

    }

    public  void search(int cellularTechnology, int batteryCapacity)
    {

    }

    public  void move(String leftKey)
    {

    }

    public  void move(String leftKey, String downKey)
    {

    }

    public  void move(String leftKey, int b)
    {

    }


}
