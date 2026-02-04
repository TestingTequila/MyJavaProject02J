package day19;

public class TestMaths {
    public static void main(String[] args) {
        Maths calc1 = new Maths();
        calc1.a = 40;
        calc1.b = 30;
        //calc1.name = "Jason"; can't access name variable as its private
        calc1.addition();
        //calc1.subtraction(); can't access substraction as this has access modifier as private

    }
}
