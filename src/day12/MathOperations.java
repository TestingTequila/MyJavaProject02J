package day12;

public class MathOperations {
    public static void main(String[] args) {

        //1. I/I = I(Pick the integer part and ignore the decimal part)
        System.out.println(10 / 2);//5
        System.out.println(9 / 2); //4

        System.out.println(15 / 4);//3

        //2. I/D  or D/I or D/D = I+D
        System.out.println(10 / 3.0); // 3.3333333333333335
        System.out.println(10.12 / 2);//5.06
        System.out.println(10.12 / 2.0);//5.06

        int a =10;
        int b=2;
        int c=3;
        double d =a/c;//3
        System.out.println(d); //3.0
        float s = 3;

        //3. Modulo Operator % (Remainder)

        System.out.println(10/2); //5
        System.out.println(10%2); //0
        System.out.println(10/3); //3
        System.out.println(10%3); //1
        System.out.println(10%3.0);//1.0

    }
}
