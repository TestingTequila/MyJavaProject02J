package day19;

public class SocialNetworkApplication {
    String username;
    String password;

    public void loginStatus()
    {
        if(username.equals("ashish1234")&&password.equals("test@1234"))
        {
            System.out.println("Login Approved....");
        }
        else
        {
            System.out.println("Invalid username/password..Can't Login...");
        }
    }
}
