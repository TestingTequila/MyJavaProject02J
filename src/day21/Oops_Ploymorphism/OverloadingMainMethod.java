package day21.Oops_Ploymorphism;

public class OverloadingMainMethod
{
    public static void main(String[] args) {
        System.out.println("This is default main method");
        OverloadingMainMethod.main("Jason", 23);
    }

    public static void main(String[] args, int a)
    {
        System.out.println("This is  main method with string array and int parameter");
    }

    public static void main(String[] args, double a)
    {
        System.out.println("This is  main method with string array and double parameter");
    }

    public static void main(String x, int a)
    {
        System.out.println("This is  main method with string and int parameter");
    }
}
