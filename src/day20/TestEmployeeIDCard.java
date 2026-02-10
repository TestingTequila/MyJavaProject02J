package day20;

public class TestEmployeeIDCard {
    public static void main(String[] args) {
        EmployeeIDCard empId1 = new EmployeeIDCard();
        String name1 = empId1.printEmployeeIdCard("Jason", "Roger");
        System.out.println("Name on Id Card: " + name1 + " MEDMA");

        EmployeeIDCard empId2 = new EmployeeIDCard();
        String name2 = empId2.printEmployeeIdCard("Kerrie", "Wright");
        System.out.println("Name on Id Card: " + name2 + " MEDMA");

    }
}
