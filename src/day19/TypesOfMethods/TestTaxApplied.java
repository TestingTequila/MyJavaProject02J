package day19.TypesOfMethods;

public class TestTaxApplied
{
    public static void main(String[] args) {
        TaxApplied emp1= new TaxApplied();
        emp1.calculateSalary(2000, 3000);
        emp1.taxRule();
        emp1.salaryToBeCredited();
    }
}
