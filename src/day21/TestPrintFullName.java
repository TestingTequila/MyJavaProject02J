package day21;

public class TestPrintFullName {
    public static void main(String[] args) {
        PrintFullName pfn = new PrintFullName();
        System.out.println(pfn.fName);//null
        System.out.println(pfn.lName);//null

        System.out.println("========================================");
        pfn.fullName("James", "Boxill");//The name of the person is James Boxill

        System.out.println(pfn.fName);//James
        System.out.println(pfn.lName);//Boxill

        System.out.println("========================================");
        pfn.marksScored(80);
    }
}
