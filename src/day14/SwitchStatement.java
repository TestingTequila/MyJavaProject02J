package day14;

public class SwitchStatement
{
    public static void main(String[] args) {

        String browser = "Chrome";

        if(browser=="Edge")
        {
            System.out.println("Launch Edge Browser....");
        }
        else if (browser=="Firefox")
        {
            System.out.println("Launch Firefox Browser....");

        }
        else if (browser=="IE")
        {
            System.out.println("Launch IE Browser....");

        }
        else if (browser=="Chrome")
        {
            System.out.println("Launch Chrome Browser....");

        }
        else if (browser=="Safari")
        {
            System.out.println("Launch Safari Browser....");

        }
        else
        {
            System.out.println("Give a valid browser Name...");
        }
    }
}
