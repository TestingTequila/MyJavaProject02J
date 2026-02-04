package day19;

public class Maths {
    //WAP to add two integer numbers and print the sum only when the addition value is less than 50, otherwise print 0;

    int a;
    int b;

    private String name;

    public void addition() {
        int sum = a + b;
        if(sum<50) {
            System.out.println("Addition: " + sum);
        }else
        {
            System.out.println("Addition: " + 0);
        }
    }

    private void subtraction() {
        int diff = a - b;
        System.out.println("Subtraction: " + diff);
    }
}
