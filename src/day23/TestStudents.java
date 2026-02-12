package day23;

public class TestStudents {
    public static void main(String[] args) {
        System.out.println("=======stud 1=========================");
        Students stud1 = new Students("Jason", "Roger", 'M', 23, true);
        stud1.printValues();

        System.out.println("=======stud 2=========================");
        Students stud2 = new Students("Kerrie", "Wright");
        stud2.printValues();

        System.out.println("=======stud 3=========================");
        Students stud3 = new Students("Kerrie", "Wright", 34);
        stud3.printValues();
    }
}
