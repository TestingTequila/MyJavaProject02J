package day20.TypesOfMethods;

public class EmployeeIDCard {
    public String printEmployeeIdCard(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        System.out.println("Employee Name: " + fullName);
        return firstName;
    }
}
