package day30;

public abstract class CarManufacturer
{
    int tyres;
    String brandName;

    public CarManufacturer()
    {
        tyres =4;
        brandName= "Audi";
    }

    public  void start()
    {
        System.out.println();
    }

    public  void stop()
    {
        System.out.println();
    }

    //public final  abstract void autoParking();
     //abstract methods can't be ever final

    //public static abstract void autoParking();
    //abstract methods can't be ever static

    //private abstract void autoParking();
      //abstract methods can't have accessModifier as private
}
