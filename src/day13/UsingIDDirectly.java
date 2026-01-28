package day13;

public class UsingIDDirectly {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);//10
        System.out.println(a);//11


        int b = 45;
        System.out.println(b++);//45
        System.out.println(b);//46

        int c = 10;
        System.out.println(c--);//10
        System.out.println(c);//9

        int d = -10;
        System.out.println(d--);//-10
        System.out.println(d);//-11

        int e = 100;
        System.out.println(++e);//101
        System.out.println(e);//101

        int f = 100;
        System.out.println(--f);//99
        System.out.println(f);//99

        int m = 200;
        int n = m++;
        System.out.println(--m);//200
        System.out.println(m);//200
        System.out.println(m++);//200
        System.out.println(m--);//201
        System.out.println(--m);//199
        System.out.println(m);//199
        System.out.println(n++);//200
        System.out.println(n);//201
    }
}
