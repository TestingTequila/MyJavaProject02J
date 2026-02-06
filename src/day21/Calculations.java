package day21;

public class Calculations
{
    int a; //
    int b; //

    public void addition(int a, int b)
    {
        int sum =a+b;
        System.out.println("Addition of " + a + " and " + b + " is : " + sum);
    }

    public void subtraction(int a, int b)
    {
        int diff =a-b;
        System.out.println("Subtraction of " + a + " and " + b + " is : " + diff);
    }

    public void multiplication(int a, int b)
    {
        this.a=a;
        this.b=b;
        int product =this.a*this.b;
        System.out.println("Multiplication of " + this.a + " and " + this.b + " is : " + product);
    }

    public void division()
    {
        int divide =a/b;
        System.out.println("Division of " + a + " and " + b + " is : " + divide);
    }




}
