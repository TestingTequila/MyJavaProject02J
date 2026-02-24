package day30;

public class FortisHospital extends MaxHospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation {
    public void medicalTrainingServices() {
        System.out.println("FH------medicalTrainingServices");
    }

    public void medicalInsuranceServices() {
        System.out.println("FH------medicalInsuranceServices");
    }

    @Override
    public void cardioServices() {
        System.out.println("FH------cardioServices");
    }

    @Override
    public void neuroServices() {
        System.out.println("FH------neuroServices");
    }

    @Override
    public void physioServices() {
        System.out.println("FH------physioServices");
    }

    @Override
    public void emergencyServices() {
        System.out.println("FH------emergencyServices");
    }

    @Override
    public void entServices() {
        System.out.println("FH------entServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("FH------dentalServices");
    }

    @Override
    public void oncoServices() {
        System.out.println("FH------oncoServices");
    }

    @Override
    public void gynoServices() {
        System.out.println("FH------gynoServices");
    }

    @Override
    public void orthoServices() {
        System.out.println("FH------orthoServices");
    }

    @Override
    public void pandemicServices() {
        System.out.println("FH---Pandemic Services");
    }

    @Override
    public void airLiftServices() {
        System.out.println("FH---airLiftServices");
    }

    public void medicalServices()
    {
        System.out.println("Fortis--Tax Calculation");
        System.out.println(WHO.firstName);// can be called through class name as variable is static in an interface
        //WHO.firstName = "Kerrie"; cannot override as this variable is final within interface
        WHO.taxCalculations(); //We can call static method of an interface using interface name
    }

    //@Override [This is an independent method and has got nothing to do with static method with same name in parent class
    public static void taxCalculations()
    {
        System.out.println("Fortis--Tax Calculation");
    }


   /*
   Cannot be overridden as this is a final method in parent class
   @Override
    public void medicalNews() {
        System.out.println("FortisHospital Medical News");
    }
    */

}
