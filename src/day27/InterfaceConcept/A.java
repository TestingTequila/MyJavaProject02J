package day27.InterfaceConcept;

public class A implements Base
{

    @Override
    public void addition(int a, int b) {
        System.out.println("Addition By A: " + (a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("Subtraction By A: " + (a-b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("Multiplication By A: " + (a*b));

    }

    @Override
    public void division(int a, int b) {
        System.out.println("Division By A: " + (a/b));
    }
}
