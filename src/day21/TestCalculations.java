package day21;

public class TestCalculations
{
    public static void main(String[] args) {
        Calculations calc = new Calculations();
        System.out.println("a : " + calc.a);//0
        System.out.println("b : " + calc.b);//0
        System.out.println("=========================================");
        calc.addition(120, 80);//200
        calc.subtraction(50,10);//40
        //calc.division();
        calc.multiplication(10,3);//27

        System.out.println("=========================================");
        System.out.println("a : " + calc.a);//10
        System.out.println("b : " + calc.b);//3
        calc.division();//3
    }
}
