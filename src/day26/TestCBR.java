package day26;

public class TestCBR
{
    public static void main(String[] args) {
       CBR cbr = new CBR(12,8);
        System.out.println(cbr.getA());//12
        System.out.println(cbr.getB());//8

        System.out.println("=====Updating the object through setter method=============");

        cbr.setA(120);
        cbr.setB(80);
        System.out.println(cbr.getA());//120
        System.out.println(cbr.getB());//80

        System.out.println("=====Updating the object through CBR method=============");

        cbr.updateValues(cbr);
        System.out.println(cbr.getA());//500
        System.out.println(cbr.getB());//600
    }
}
