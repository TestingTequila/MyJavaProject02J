package day28;

public class BMW extends Car
{

     int carModelYear = 2018;

    public  void autoParking()
    {
        System.out.println("BMW auto-parking....");
    }

    @Override
    public void start() {
        System.out.println("BMW Start...");
    }

    public static void refuel() {
        System.out.println("BMW Refuel...");
    }

    // This cannot be overridden as this method is final in PArent class
//    public  void stop() {
//        System.out.println("BMW Stop...");
//    }
}
