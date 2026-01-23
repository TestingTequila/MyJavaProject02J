package day12;

public class StringConcatenationExamples {
    public static void main(String[] args) {
        String x = "Hello";
        String y = "World";
        int a = 100;
        int b = 200;

        System.out.println(x);//Hello
        System.out.println(y);//World
        System.out.println(a);//100
        System.out.println(b);//200

        System.out.println(a + b);//300
        System.out.println(x + y); //Hello+World => HelloWorld

        System.out.println(x + a); //Hello + 100 => Hello100
        System.out.println(a + b + x + y);//300HelloWorld
        System.out.println(x + y + a + b);//HelloWorld100200

        System.out.println(x + a + y + b);//Hello100World200

        System.out.println(a + b + x + y + a + b);//300HelloWorld100200

        System.out.println(x + a + b + a + y + a + b + y);//Hello100200100World100200World
    }
}
