package day25;

public class Keyword {
    //1. Global variable (instance Variable) & Parameters
    int a;
    int b;

    public void addition(int a, int b) {
        //this(12,56); we cannot call a constructor inside a method
        this.a = a;
        this.b = b;
    }

    //2. Constructor calling within the same class

    public  Keyword(int x, int y)
    {
        this(x,y, "Jason");
        System.out.println("Constructor with int Parameters " + x + " and " + y);
        //addition(33,7);// we can call a method inside of constructor
    }

    public  Keyword(int x, int y , String name)
    {
        System.out.println("Constructor with int and String Parameter " + x + " and " + y + " and " + name);

    }

    //To call one static method inside other static method of the same class
}


//44, 6, Jason
//44 and 6