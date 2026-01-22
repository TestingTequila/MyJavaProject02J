package day11;

public class HandlingIntegerDataTypes {

    public static void main(String[] args) {

        byte b = 127; //1 Byte(8 bits), -128 to +127

        short s = 32767;// 2 Bytes(16 bits), -32768 to 32767

        int i = 2147483647; //4 Bytes(32 bits), -2147483648 to 2147483647

        long l =2147483648L;// 8 byte(64 bits),-9223372036854775808, 9223372036854775807

        // short cut to print something [sout]
        //System.out.println(10000);

        System.out.println(l);

        //How to get the range of any data type

        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128

        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647

        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        System.out.println(Long.MAX_VALUE);//-9223372036854775807

        int t=10;
        t= t*200;
        System.out.println(b);

        //int i1 = 100.78; invalid as data type and the assigned value differs


    }


}
