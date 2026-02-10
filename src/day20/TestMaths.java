package day20;

public class TestMaths {
    public static void main(String[] args) {
        Maths math = new Maths();
        //int sum1 =math.addition1(12,8);//void: 20
        //System.out.println(sum1*5);

        int sum2 = math.addition2(12, 8);//int : 20
        System.out.println(sum2 * 5);

        boolean check = math.isEligibleToVote(17);
        if (check) {
            System.out.println("You can Vote....");
        } else {
            System.out.println("You are below 18...can't vote...");
        }

        System.out.println("=========================================================");
        boolean loginStatus =math.login("jason.roger", "test@1234");
        if(loginStatus)
        {
            System.out.println("Redirect to Home Page...");
        }
        else
        {
            System.out.println("Throw Error message....Please check your Credentials...");
        }

    }
}
