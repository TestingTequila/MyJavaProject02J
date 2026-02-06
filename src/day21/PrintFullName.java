package day21;

public class PrintFullName
{
    String fName;
    String lName;

    public void fullName(String fName, String lName)
    {
        this.fName = fName;
        this.lName = lName;
        System.out.println("The name of the person is: " + this.fName + " " + this.lName);
    }

    public  void marksScored(int marks)
    {
        if(marks>=60)
        {
            System.out.println(fName + " " + lName+ " has scored Grade A");
        }
        else
        {
            System.out.println(fName + " " + lName+ " has scored Grade F");
        }
    }
}
