package day20.TypesOfMethods;

public class TestStudents {
    public static void main(String[] args) {
        Students stud1 = new Students();
        int marks = stud1.getStudentsMarks("Tazeen");
        if(marks>=0) {
            System.out.println("Marks Scored is : " + marks);
        }else
        {
            System.out.println("Not a Student of this class");
        }
    }
}
