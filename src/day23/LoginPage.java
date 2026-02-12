package day23;

public class LoginPage
{
    private String username;
    private String password;

    public  LoginPage(String username, String  password)
    {
        this.username = username;
        this.password = password;
    }

    public  void login()
    {
        if(username.equals("jason123") && password.equals("test@1234"))
        {
            System.out.println("Login is successful.....");
        }
        else
        {
            System.out.println("Login Failed...Please check your Credentials....");
        }
    }
}