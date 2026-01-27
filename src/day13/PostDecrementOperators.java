package day13;

public class PostDecrementOperators {
    public static void main(String[] args) {

        //1. Post Decrement Operator [variableName--==> Assignment and then Decrement]

        int a = 1;
        int b = a--;
        System.out.println(a);//0
        System.out.println(b);//1

        int c = 20;
        int d = c--;
        System.out.println(c);//19
        System.out.println(d);//20

        int e = 999;
        int f = e--;
        System.out.println(e);//998
        System.out.println(f);//999

        int g = 54;
        int h = g--;
        System.out.println(g);//53
        System.out.println(h);//54

        int i = -10;
        int j = i--;
        System.out.println(i);//-11
        System.out.println(j);//-10

        int k = -90;
        int l = k--;
        System.out.println(k);//-91
        System.out.println(l);//-90


    }
}
