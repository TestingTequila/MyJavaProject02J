package day13;

public class PreIncrementOperators {
    public static void main(String[] args) {

        //1. Pre Increment Operator [++variableName==> Increment and then Assignment]

        int a = 1;
        int b = ++a;
        System.out.println(a);//2
        System.out.println(b);//2

        int c = 20;
        int d = ++c;
        System.out.println(c);//21
        System.out.println(d);//21

        int e = 999;
        int f = ++e;
        System.out.println(e);//1000
        System.out.println(f);//1000

        int g = 54;
        int h = ++g;
        System.out.println(g);//55
        System.out.println(h);//55

        int i = -10;
        int j = ++i;
        System.out.println(i);//-9
        System.out.println(j);//-9

        int k = -90;
        int l = ++k;
        System.out.println(k);//-89
        System.out.println(l);//-89


    }
}
