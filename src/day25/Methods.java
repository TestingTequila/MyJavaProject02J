package day25;

public class Methods {
    public void A() {
        System.out.println("This is method A");
        this.B();
        this.C();
    }

    public void B() {
        System.out.println("This is method B");
    }

    public void C() {
        System.out.println("This is method C");
        A();
    }

    public static void S() {
        System.out.println("This is static method S");

    }

    public static void T() {
        System.out.println("This is static method T");
    }

    public static void U() {
        System.out.println("This is static method U");
        S();
    }
}
