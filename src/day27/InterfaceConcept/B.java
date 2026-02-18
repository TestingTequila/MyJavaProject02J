package day27.InterfaceConcept;

public class B implements Base{
    @Override
    public void addition(int a, int b) {
        System.out.println("Addition By B: " + (2*a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("Subtraction By B: " + (2*a-b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("Multiplication By B: " + (2*a*b));

    }

    @Override
    public void division(int a, int b) {
        System.out.println("Division By B: " + (2*a/b));
    }
}
