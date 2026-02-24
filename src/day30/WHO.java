package day30;

public interface WHO{

    String firstName= "Jason";

    //public WHO(){} we cannot create constructors inside an interface
    public void pandemicServices();

    public static void taxCalculations()
    {
        System.out.println("WHO--Tax Calculation");
    }

    default void medicalServices()
    {
        System.out.println("WHO--Tax Calculation");
    }
}
