package day19.TypesOfMethods;

public class TestMathematics2 {
    public static void main(String[] args) {
        Mathematics2 math2 = new Mathematics2();
        math2.addition(12, 8); //12+8 ==>20
        math2.subtraction(15, 10);//15-10 ==>5
        math2.multiplication(5, 4);//5*4 ==>20

        System.out.println("===================================");

        Mathematics2 math22 = new Mathematics2();
        math22.addition(3, 4);//7
        math22.subtraction(5, 2);//3
        math22.multiplication(3, 5);//15
    }
}
