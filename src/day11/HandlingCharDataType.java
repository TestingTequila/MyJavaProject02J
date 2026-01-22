package day11;

public class HandlingCharDataType {
    public static void main(String[] args) {

        char c = 'a'; // 2 bytes, a-z, 0-9, A-Z, all special characters
        char c1 = 'b';
        char c2 = '1';
        char c3 = '9';
        char c4 = 'A';
        char c5 = 'Z';
        char c6 = '$';
        char c7 = '*';
        char c8 = 'y';
        char c9 = 'n';

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        // can we store 10 as char data type? No
        // aligning the code : Control + Alt+ L

        System.out.println("===================================================");
        char c11 = 'a';
        char c22 = 'b';
        System.out.println(c11);
        System.out.println(c22);
        System.out.println(c11+c22); //97+98 = 195
        System.out.println(c11*c22); //97*98 = 9506

        System.out.println("===================================================");

        char u1 = 'a';
        char u2 = 'b';
        System.out.println(u1);//a
        System.out.println(u2);//b
        System.out.println(u1+u2);//97+98 = 195
        System.out.println((int)u1+(int) u2);//97+98 = 195
        System.out.println((int)u1);//97
        System.out.println((int)'a');//97
        System.out.println(u1+0); //97+0 = 97
        System.out.println(u1+'0'); //97 + 48 = 145
        System.out.println((char)97);//a








    }
}
