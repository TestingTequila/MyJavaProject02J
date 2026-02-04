package day19.TypesOfMethods;

public class Mathematics
{
    //WAP to perform addition, subtraction and multiplication of two integer numbers

    //MethodWithParameters(have something)+methodWithoutReturnType[void]
    int a;//Global Variables or Class Level Variable or instance Variables
    int b;

    public void addition()
    {
        int sum=a+b;
        System.out.println("Addition: " + sum);
    }

    public void subtraction()
    {
        int diff=a-b;
        System.out.println("Subtraction: " + diff);
    }

    public void multiplication()
    {
        int product=a*b;
        System.out.println("Multiplication: " + product);
    }


}
