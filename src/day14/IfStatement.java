package day14;

public class IfStatement {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b);//false

        System.out.println(b > 15);//true

        System.out.println(a > 25);//false

        System.out.println("============================================");

        int age = 15;
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        }

    }
}
