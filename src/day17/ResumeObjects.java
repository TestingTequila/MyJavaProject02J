package day17;

public class ResumeObjects {
    public static void main(String[] args) {

        System.out.println("=======Ahmad's Resume==================");
        Resume ahmadResume = new Resume();
        ahmadResume.firstName = "Khalil";
        ahmadResume.lastName = "Ahmad";
        ahmadResume.age = 28;
        ahmadResume.gender = 'M';
        ahmadResume.salary = 8000.67;

        System.out.println("First Name: " + ahmadResume.firstName);
        System.out.println("Last Name: " + ahmadResume.lastName);
        System.out.println("Age: " + ahmadResume.age);
        System.out.println("Gender: " + ahmadResume.gender);
        System.out.println("Salary: " + ahmadResume.salary);

        System.out.println("=======James Resume==================");
        Resume jamesResume = new Resume();
        jamesResume.firstName = "James";
        jamesResume.lastName = "Boxill";
        jamesResume.age = 34;
        jamesResume.gender = 'M';
        jamesResume.salary = 14000;
        System.out.println("First Name: " + jamesResume.firstName);
        System.out.println("Last Name: " + jamesResume.lastName);
        System.out.println("Age: " + jamesResume.age);
        System.out.println("Gender: " + jamesResume.gender);
        System.out.println("Salary: " + jamesResume.salary);

        System.out.println("=======Kerrie Resume==================");

        Resume kerrieResume = new Resume();
        kerrieResume.firstName = "Kerrie";
        kerrieResume.lastName = "Wright";
        kerrieResume.age = 32;
        kerrieResume.gender = 'F';
        kerrieResume.salary = 3456.87;
        System.out.println("First Name: " + kerrieResume.firstName);
        System.out.println("Last Name: " + kerrieResume.lastName);
        System.out.println("Age: " + kerrieResume.age);
        System.out.println("Gender: " + kerrieResume.gender);
        System.out.println("Salary: " + kerrieResume.salary);


    }
}
