package day20;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee emp1= new Employee();
        double empSalary =emp1.calculateSalary(5000, 3000);
        System.out.println("Amount Credited: " + (empSalary+1000));


    }
}
