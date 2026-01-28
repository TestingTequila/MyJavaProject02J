package day14;

public class IfElseIfStatement {
    public static void main(String[] args) {

        int marks = 85;
        if (marks < 67) {
            System.out.println("Student has scored Grade A");
        } else if (marks < 55) {
            System.out.println("Student has scored Grade B");
        } else if (marks > 84) {
            System.out.println("Student has scored Grade C");
        } else if (marks > 90) {
            System.out.println("Student has scored Grade D");
        } else {
            System.out.println("Student has not cleared the Exam");
        }

        System.out.println("=========================================");
        int mark = 85;
        if (mark < 67) {
            System.out.println("Student has scored Grade A");
        } else if (mark < 55) {
            System.out.println("Student has scored Grade B");
        } else if (mark > 90) {
            System.out.println("Student has scored Grade D");
        } else if (mark > 84) {
            System.out.println("Student has scored Grade C");
        } else {
            System.out.println("Student has not cleared the Exam");
        }
    }
}

