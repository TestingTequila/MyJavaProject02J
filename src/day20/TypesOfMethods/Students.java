package day20.TypesOfMethods;

public class Students
{
    public  int getStudentsMarks(String studentName)
    {
        int marks=-1;

        System.out.println("Marks of: " + studentName);
        if(studentName.equals("Jason"))
        {
            //return 92;
            marks = 92;
        }
        else if(studentName.equals("Kerrie"))
        {
            //return 85;
            marks=85;
        }
        else if (studentName.equals("Ahmad"))
        {
            //return 95;
            marks = 95;
        }
        else if (studentName.equals("James"))
        {
            //return 87;
            marks=87;
        }
        else if (studentName.equals("Tazeen"))
        {
            //return 91;
            marks =91;
        }
        else if (studentName.equals("Charles"))
        {
            //return 0;
            marks =0;
        }
        return marks;
    }
}
