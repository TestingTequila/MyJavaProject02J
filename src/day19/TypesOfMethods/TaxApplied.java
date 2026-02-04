package day19.TypesOfMethods;

public class TaxApplied
{

    int salary;
    double taxAmount;

    public void calculateSalary(int basicSalary,int travelAllowance)
    {
        salary =basicSalary+travelAllowance;
        System.out.println("Salary is : " + salary);
    }

    public void taxRule()
    {
        double taxRate= 0.3;
        taxAmount= salary*taxRate;
        System.out.println("Tax Amount : " + taxAmount);
    }

    public  void salaryToBeCredited()
    {
        double finalSalary =salary- taxAmount;
        System.out.println("Salary Credited is: " + finalSalary);
    }
}
