package day19;

public class TestSocialNetworkApplication {
    public static void main(String[] args) {
        SocialNetworkApplication facebook = new SocialNetworkApplication();
        facebook.username = "jason123";
        facebook.password = "test@1234";
        facebook.loginStatus();

        System.out.println("=====================================");

        day19.SocialNetworkApplication orkut = new SocialNetworkApplication();
        orkut.username = "ashish1234";
        orkut.password = "test@1234";
        orkut.loginStatus();
    }
}
