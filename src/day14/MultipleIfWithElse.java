package day14;

public class MultipleIfWithElse {
    public static void main(String[] args) {

        int x = 90;

        if (x > 100) {
            System.out.println("True Statement A");
        }
        if (x > 200) {
            System.out.println("True Statement B");
        }
        if (x > 80) {
            System.out.println("True Statement C");
        }
        if (x > 300) {
            System.out.println("True Statement D");
        }
        if (x > 50) {
            System.out.println("True Statement E");
        } else {
            System.out.println("False Statement");
        }

        System.out.println("===========================================");
        int marks = 85;
        if(marks<67)
        {
            System.out.println("Student has scored Grade A");
        }
        if(marks<55)
        {
            System.out.println("Student has scored Grade B");
        }
        if(marks>84)
        {
            System.out.println("Student has scored Grade C");
        }
        if(marks>90)
        {
            System.out.println("Student has scored Grade D");
        }
        else
        {
            System.out.println("Student has not cleared the Exam");
        }
    }
}
