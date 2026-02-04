package day19.TypesOfMethods;

public class Mathematics2
{
    //WAP to perform addition, subtraction and multiplication of two integer numbers

    //MethodWithParameters(have something)+methodWithoutReturnType[void]

    public void addition(int a,int b )
    {
        int sum=a+b;
        System.out.println("Addition: " + sum);
    }

    public void subtraction(int a, int b)
    {
        int diff=a-b;
        System.out.println("Subtraction: " + diff);
    }

    public void multiplication(int a, int b)
    {
        int product=a*b;
        System.out.println("Multiplication: " + product);
    }


}
