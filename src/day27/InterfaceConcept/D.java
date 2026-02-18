package day27.InterfaceConcept;

public class D implements Base
{
    @Override
    public void addition(int a, int b) {
        System.out.println("Addition By D: " + (4*a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("Subtraction By D: " + (4*a-b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("Multiplication By D: " + (4*a*b));

    }

    @Override
    public void division(int a, int b) {
        System.out.println("Division By D: " + (4*a/b));
    }
}
