package day24;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpName("Kerrie");
        emp1.setEmpSalary(12000);

        System.out.println("Pay the employee: " + emp1.getEmpName() + " a Salary of: $" + emp1.getEmpSalary());
    }
}
