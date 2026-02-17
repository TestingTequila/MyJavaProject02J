package day25.CallByValueReference;

public class CBR
{
    private  int a;
    private  int b;

    //If i want to update the value for the same object, i can do using setter method
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    //Using getter method to get the value assigned by constructor
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


    //Setting value of instance variables using Constructor
    public CBR(int a, int b)
    {
        this.a=a;
        this.b=b;
    }

    public  void updateValues(CBR cbr)
    {
        this.a =500;
        this.b =600;
    }
}
