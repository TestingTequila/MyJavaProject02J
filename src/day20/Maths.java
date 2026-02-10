package day20;

public class Maths {

    public void addition1(int a, int b)
    {
        int sum = a + b;
        System.out.println("Addition1: " + sum);
    }

    public int addition2(int a, int b)
    {
        int sum = a + b;
        System.out.println("Addition2: " + sum);
        return sum;
    }

    public  boolean isEligibleToVote(int age)
    {
        if(age>=18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public  boolean login(String userName, String password)
    {
        if(userName.equals("jason.roger")&& password.equals("test@1234"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
