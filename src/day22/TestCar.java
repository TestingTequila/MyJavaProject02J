package day22;

public class TestCar {
    public static void main(String[] args) {

        System.out.println("=======================c1 Object===============================");
        Car c1 = new Car();
        c1.name = "BMW";
        c1.price = 90000;
        c1.color = "Red";
        //c1.wheels = 4;
        //Car.wheels =5; can't be edited as its final
        System.out.println(c1.name);
        System.out.println(c1.price);
        System.out.println(c1.color);
        System.out.println(Car.wheels);//static variable
        c1.speedTest();//non-static
        Car.stop(); //static method

        System.out.println("=======================c2 Object===============================");
        Car c2 = new Car();
        c2.name = "Audi";
        c2.price = 80000;
        c2.color = "White";
        //c2.wheels = 4;
        System.out.println(c2.name);
        System.out.println(c2.price);
        System.out.println(c2.color);
        System.out.println(Car.wheels); //static variable
        c1.speedTest();//non-static
        Car.stop();    //static

        System.out.println("=======================c3 Object===============================");
        Car c3 = new Car();
        c3.name = "Honda";
        c3.price = 60000;
        c3.color = "Black";
        //c3.wheels = 4;
        System.out.println(c3.name);
        System.out.println(c3.price);
        System.out.println(c3.color);
        System.out.println(Car.wheels);//static variable
        c1.speedTest();//non-static method
        Car.stop(); //static method
    }
}
