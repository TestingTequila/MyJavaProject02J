package day18;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.Name = "Amaze";
        car.brand = "Honda";
        car.maxSpeed = 300;
        car.numberOfWheels = 4;
        car.isAutomatic = true;

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Vehicle truck = new Vehicle();
        truck.Name = "XZA LUXS";
        truck.brand = "MERC";
        truck.numberOfWheels = 10;
        truck.maxSpeed = 500;
        truck.isAutomatic = false;
        System.out.println(truck.Name);
        System.out.println(truck.brand);
        System.out.println(truck.numberOfWheels);
        System.out.println(truck.maxSpeed + " km/hr");
        System.out.println(truck.isAutomatic);
    }
}
