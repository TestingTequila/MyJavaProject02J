package day23;

public class User {
    private String name;//null
    private int age;//0
    private String email;//null
    private String password;//null
    private String phone;//null

    //Default Constructor
    public User() {
        System.out.println("This is my Default Constructor.....");
        this.name = "Jason";
        this.age = 23;
        this.email = "jason.roger@janbask.com";
        this.password = "test@1234";
        this.phone = "5464575756";

        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.email);
        System.out.println(this.password);
        System.out.println(this.phone);
     }

    public void statement() {
        System.out.println("This is my Method.....");
    }
}
