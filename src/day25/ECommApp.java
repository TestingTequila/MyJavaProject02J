package day25;

public class ECommApp {
    public ECommApp login() {
        System.out.println("Login to app");
        return this;
    }

    public ECommApp login(String un, String pw) {
        System.out.println("Login to app");
        //return new ECommApp(); avoid as this will create a new object in Heap memory
        return this;
    }

    public ECommApp doSearch(String productName) {
        System.out.println("search product: " + productName);
        return this;
    }

    public ECommApp doSearch(String productName, int price) {
        System.out.println("search product: " + productName + ": price " + price);
        return this;

    }

    public ECommApp doSearch(String productName, int price, String brand) {
        System.out.println("search product: " + productName + ": price " + price + " brand " + brand);
        return this;
    }

    public ECommApp addToCart(String productName) {
        System.out.println("adding to cart: " + productName);
        return this;
    }

    public ECommApp doPayment(String cc, int cvv) {
        System.out.println("making payment using : " + cc + ":" + cvv);
        return this;
    }

    public ECommApp doPayment(String upi) {
        System.out.println("making payment using : " + upi);
        return this;
    }

    public ECommApp doPayment(String paypalID, String password) {
        System.out.println("making payment using : " + paypalID + ":" + password);
        return this;
    }

    public ECommApp generateOrder() {
        System.out.println("your order id is : " + 12345);
        return this;
    }

    public ECommApp logout() {
        System.out.println("logout");
        return this;
    }
}
