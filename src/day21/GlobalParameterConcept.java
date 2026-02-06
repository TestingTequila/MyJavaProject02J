package day21;

public class GlobalParameterConcept
{
    int a;//2
    int b;//5

    public  void multiplication(int a, int b)
    {
        this.a = a;
        this.b =b;
        int product = this.a * this.b;
        System.out.println("Multiplication of " + this.a + " and " + this.b + " is : " + product);
    }
}
