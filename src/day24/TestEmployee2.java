package day24;

public class TestEmployee2 {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2("Kerrie", 14000);
        System.out.println("Pay the employee: " + emp1.getEmpName() + " a Salary of: $" + emp1.getEmpSalary());
        System.out.println("===================After Updating the value of the same object============");
        emp1.setEmpName("Max");
        emp1.setEmpSalary(12000);
        System.out.println("Pay the employee: " + emp1.getEmpName() + " a Salary of: $" + emp1.getEmpSalary());


    }
}
