package day20.TypesOfMethods;

public class TestBrowsers {
    public static void main(String[] args) {
        Browsers browser = new Browsers();
        String browserLaunched = browser.launchBrowser("Safari");

        System.out.println("Browser in picture " + browserLaunched);
        if(browserLaunched.equals("Safari"))
        {
            System.out.println("You can enter the credentials");
        }
        else
        {
            System.out.println("Don't allow access to enter credentials...");
        }
    }
}
