package day25;

public class TestECommApp {
    public static void main(String[] args) {
        ECommApp app = new ECommApp();
        app.login();
        app.doSearch("Iphone");
        app.doPayment("44645645", 787);
        app.generateOrder();
        app.logout();

        app.login("jass123", "43534").doSearch("MacBook").doPayment("4645654", 678).generateOrder().logout();
        app.doSearch("LED TV", 56765).logout();
    }
}
