package day24;

public class Employee1 {
    private String empName;//Kerrie
    private int empSalary;//14000

    public Employee1(String empName, int empSalary) {
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        String[] employeesName = {"Max", "Kerrie", "Tony", "John"};
        String name = " ";
        for (String emp : employeesName) {
            if (emp.contains(empName)) {
                name = empName;
                break;
            } else {
                name = "N/A";
            }
        }
        return name;
    }

    public int getEmpSalary() {
        int salary;
        if (empSalary > 2000 && empSalary <= 15000) {
            salary = empSalary;
        } else {
            salary = 0;
        }
        return salary;
    }

}

