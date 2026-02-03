package day18;

public class TestUser {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Ravi";
        user1.age = 25;
        user1.city = "NY";

        User user2 = new User();
        user2.name = "Ahmad";
        user2.city = "Ohio";
        user2.age = 27;

        User user3 = new User();
        user3.name = "Kerrie";
        user3.city = "London";
        user3.age = 33;

        System.out.println(user1.name + ", " + user1.city + ", " + user1.age);//Ravi
        System.out.println(user2.name + ", " + user2.city + ", " + user2.age);//Ahmad
        System.out.println(user3.name + ", " + user3.city + ", " + user3.age);//Kerrie

        System.out.println("===================user1 = user2======================");

        user1 = user2;

        System.out.println(user1.name + ", " + user1.city + ", " + user1.age);//Ahmad
        System.out.println(user2.name + ", " + user2.city + ", " + user2.age);//Ahmad
        System.out.println(user3.name + ", " + user3.city + ", " + user3.age);//Kerrie


        System.out.println("==================user2 = user3=======================");
        user2 = user3;
        System.out.println(user1.name + ", " + user1.city + ", " + user1.age);//Ahmad
        System.out.println(user2.name + ", " + user2.city + ", " + user2.age);//Kerrie
        System.out.println(user3.name + ", " + user3.city + ", " + user3.age);//Kerrie

        System.out.println("==================user3 = user1=======================");
        user3 = user1;
        System.out.println(user1.name + ", " + user1.city + ", " + user1.age);//Ahmad
        System.out.println(user2.name + ", " + user2.city + ", " + user2.age);//Kerrie
        System.out.println(user3.name + ", " + user3.city + ", " + user3.age);//Ahmad

        System.out.println("==================user2 =user3=======================");
        user2 = user3;
        System.out.println(user1.name + ", " + user1.city + ", " + user1.age);//Ahmad
        System.out.println(user2.name + ", " + user2.city + ", " + user2.age);//Ahmad
        System.out.println(user3.name + ", " + user3.city + ", " + user3.age);//Ahmad

    }
}
