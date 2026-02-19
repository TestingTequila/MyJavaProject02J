package day28;

public class Car extends Vehicle {

    int carModelYear = 2016;
    final int AGE = 45;

    public void start() {
        System.out.println("Car Start...");
    }

    public static final void stop() {
        System.out.println("Car Stop...");
    }

    public static void refuel() {
        System.out.println("Car Refuel...");
    }
}
