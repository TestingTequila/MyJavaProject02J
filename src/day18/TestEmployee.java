package day18;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.fullName = "Jason Roger";
        emp1.salary = 7000.78;
        emp1.totalExperience = 3;
        emp1.gender = 'M';
        emp1.location = "NJ";

        System.out.println(emp1.fullName);
        System.out.println("$"+emp1.salary);
        System.out.println(emp1.totalExperience);
        System.out.println(emp1.gender);
        System.out.println(emp1.location);

    }
}
