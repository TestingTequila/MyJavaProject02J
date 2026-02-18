package day27;

public abstract class MethodTypes
{
    //Concrete Method
    public void addition(int a, int b)
    {
        System.out.println("Addition: " + (2*a+b));
    }

    //Abstract Method
    public abstract void subtraction(int a, int b);
}

//Class[only concrete methods] Vs Abstract Class [can hold both concrete & Abstract Methods]