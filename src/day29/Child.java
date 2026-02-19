package day29;

public class Child extends Parent
{
    public void Car()
    {
        System.out.println("Child Car");
    }

    public  void softwareCompany()
    {
        System.out.println("Child's S/W Company");
    }

    // Cannot be overridden as this has final keyword
//    public void ancestralHouse()
//    {
//        System.out.println("Ancestral House to Museum");
//    }

    //This is not an overridden method, this shares the same name as Parent class hospital but has no relation with it
    public static void hospital()
    {
        System.out.println("Child's Hospital with modern amenities");
    }

    @Override
    public void restaurant()
    {
        System.out.println("Child's Restaurant- Veg+ Non Veg Food");
    }
}
