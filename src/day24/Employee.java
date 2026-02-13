package day24;

public class Employee {
    private String empName;
    private int empSalary;

    public void setEmpName(String empName) {
        String[] employeesName = {"Max", "Kerrie", "Tony", "John"};
        for (String emp : employeesName) {
            if (emp.contains(empName)) {
                this.empName = empName;
                break;
            } else {
                this.empName = "N/A";
            }
        }

    }

    public void setEmpSalary(int empSalary) {
        if (empSalary > 2000 && empSalary <= 15000) {
            this.empSalary = empSalary;
        } else {
            this.empSalary = 0;
        }
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

}

