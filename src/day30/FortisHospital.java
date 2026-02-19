package day30;

public class FortisHospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation {
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
}
