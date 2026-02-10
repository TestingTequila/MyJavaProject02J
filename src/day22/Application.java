package day22;

public class Application {
    public void m1() {
        System.out.println("NS: m1 method");
        Application app = new Application();
        app.m2();
    }

    public void m2() {
        System.out.println("NS: m2 method");
        Application app = new Application();
        app.m3();
        Application.t2();
    }

    public void m3() {
        System.out.println("NS: m3 method");
    }

    public static void t1() {
        System.out.println("S: t1 method");
        Application.t2();
    }

    public static void t2() {
        System.out.println("S: t2 method");
        Application.t3();
    }

    public static void t3() {
        System.out.println("S: t3 method");
        Application app = new Application();
        app.m3();
    }
}
