package day20;

public class Browsers {
    public String launchBrowser(String browserName) {
        String browser = " ";
        switch (browserName) {
            case "Chrome":
                //return "Chrome";
                browser = "Chrome";
                break;
            case "Firefox":
                //return "Firefox";
                browser = "Firefox";
                break;
            case "IE":
                //return "IE";
                browser = "IE";
                break;
            case "Safari":
                //return "Safari";
                browser = "Safari";
                break;
            default:
               // return browser;
        }

        return browser;
    }
}
