package day28;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.refuel();
        c1.stop();

        System.out.println("============================");


        BMW b1 = new BMW();
        b1.autoParking();//self
        b1.start();//Inherited
        BMW.refuel();//Inherited // Car Refuel/ BMW Refuel
        b1.stop();//Inherited
        System.out.println(b1.carModelYear);//2018
        b1.cruiseControl();

        System.out.println("============Top Casting============");
        Car c2 = new BMW();
        c2.start();//BMW Start
        Car.refuel();// Car Refuel/BMW Refuel
        c2.stop();  // Car Stop
        System.out.println(c2.carModelYear);//2016
        c2.cruiseControl();

        System.out.println("==============Down Casting========");

        BMW b2 = (BMW) new Car();// Down casting seems possible at compile
        //On running, we will get, ClassCastException
        //Down Casting is not possible in Java
    }
}
