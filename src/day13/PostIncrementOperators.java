package day13;

public class PostIncrementOperators {
    public static void main(String[] args) {

        //1. Post Increment Operator [variableName++==> Assignment and then Increment]

        int a = 1;
        int b = a++;
        System.out.println(a);//2
        System.out.println(b);//1

        int c = 20;
        int d = c++;
        System.out.println(c);//21
        System.out.println(d);//20

        int e = 999;
        int f = e++;
        System.out.println(e);//1000
        System.out.println(f);//999

        int g = 54;
        int h = g++;
        System.out.println(g);//55
        System.out.println(h);//54

        int i = -10;
        int j = i++;
        System.out.println(i);//-9
        System.out.println(j);//-10

        int k = -90;
        int l = k++;
        System.out.println(k);//-89
        System.out.println(l);//-90


    }
}
