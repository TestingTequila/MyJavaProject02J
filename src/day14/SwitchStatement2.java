package day14;

public class SwitchStatement2 {
    public static void main(String[] args) {

        String browser = "Chrome";

        switch (browser) {
            case "Edge":
                System.out.println("Launch Edge Browser...");
                break;
            case "Firefox":
                System.out.println("Launch Firefox Browser...");
                break;
            case "IE":
                System.out.println("Launch IE Browser...");
                break;
            case "Chrome":
                System.out.println("Launch Chrome Browser...");
                break;
            case "Safari":
                System.out.println("Launch Safari Browser...");
                break;
            default:
                System.out.println("Give a valid browser Name");
                break;
        }

        System.out.println("==============================");


    }
}
