package day29;

public class Test {
    public static void main(String[] args) {
        System.out.println("==========Parent Class Object========");

        Parent parent = new Parent();
        parent.fixedDeposit();//Parents FD
        parent.shares();//Parents Shares
        parent.ancestralHouse();//Parents ancestral House
        Parent.hospital();//Parents Hospital
        parent.restaurant();//Parents Restaurant-Veg Food Only

        System.out.println("==========Child Class Object========");

        Child child = new Child();
        child.Car();//Child Car
        child.softwareCompany();//Child's S/W Company
        child.fixedDeposit();//Parents FD
        child.shares();//Parents Shares
        child.ancestralHouse();//Parents ancestral House
        Child.hospital();//Parents Hospital
        child.restaurant();//Parents Restaurant-Veg Food Only --> Child Res....

        System.out.println("============Top Casting==============");
        Parent parent1= new Child();
        parent1.fixedDeposit();//Parents FD
        parent1.shares();//Parents Shares
        parent1.ancestralHouse();//Parents ancestral House
        parent1.hospital();//Parents Hospital
        parent1.restaurant();//Parents Restaurant-Veg Food Only --> Child Res....
    }
}
