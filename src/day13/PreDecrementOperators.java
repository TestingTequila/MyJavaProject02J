package day13;

public class PreDecrementOperators {
    public static void main(String[] args) {

        //1. Pre Decrement Operator [--variableName==> Decrement and then Assignment]

        int a = 1;
        int b = --a;
        System.out.println(a);//0
        System.out.println(b);//0

        int c = 20;
        int d = --c;
        System.out.println(c);//
        System.out.println(d);//

        int e = 999;
        int f = --e;
        System.out.println(e);//
        System.out.println(f);//

        int g = 54;
        int h = --g;
        System.out.println(g);//
        System.out.println(h);//

        int i = -10;
        int j = --i;
        System.out.println(i);//-11
        System.out.println(j);//-11

        int k = -90;
        int l = --k;
        System.out.println(k);//
        System.out.println(l);//


    }
}
