package day19.TypesOfMethods;

public class TestMathematics {
    public static void main(String[] args) {
        Mathematics math1 = new Mathematics();
        math1.a = 12;
        math1.b = 8;
        math1.addition();//12+8 ==> 20
        math1.subtraction();//12-8==>4
        math1.multiplication();//12*8 => 96

        System.out.println("=============================================");

        Mathematics math2= new Mathematics();
        math2.a =6;
        math2.b =4;
        math2.addition();//6+4 ==>10
        math2.subtraction();//6-4 ==>2
        math2.multiplication();//6*4 ==> 24
    }
}
