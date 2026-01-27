package day13;

public class MiscIDOnOtherDataTypes {
    public static void main(String[] args) {

        double a = 2.5;
        double b = a++;
        System.out.println(a);//3.5
        System.out.println(b);//2.5


        float c = -10.7F;
        float d = --c;
        System.out.println(c);//-11.7
        System.out.println(d);//-11.7

        char e = 'a';
        char f = e++;
        System.out.println(e);//b
        System.out.println(f);//a


        char g = 'a';
        char h = --g;
        System.out.println(g);//'
        System.out.println(h);//'
    }
}
