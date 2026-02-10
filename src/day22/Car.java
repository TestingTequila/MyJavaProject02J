package day22;

public class Car
{
    String name;
    int price;
    String color;
    final static int wheels=4;

    public void speedTest()
    {
        System.out.println("Car -----speed Test");
        //static int steeringWheel; local variables can't be static
    }

    public static void stop()
    {
        System.out.println("Car---Stop");
    }
}
