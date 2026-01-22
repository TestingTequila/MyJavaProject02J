package day11;

public class HandlingDecimalDataType {
    public static void main(String[] args) {

        float f = 12.123456789F;//6/7 decimal places ,4 byte(32 bits)

        double d = 12.123456789098765432;//15/16 decimal places 8 byte(64 bits)

        float f1 = (float) 100.987456;

        System.out.println(f);
        System.out.println(d);
    }


}
