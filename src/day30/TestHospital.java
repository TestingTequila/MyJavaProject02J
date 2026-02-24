package day30;

public class TestHospital {
    public static void main(String[] args) {
        System.out.println("=====Object--Fortis Hospital==========");
        FortisHospital fh = new FortisHospital();
        fh.medicalTrainingServices();//Self Services
        fh.medicalInsuranceServices();//Self Services

        fh.cardioServices();//US
        fh.neuroServices();//US
        fh.physioServices();//US

        fh.entServices();//UK
        fh.dentalServices();//UK

        fh.oncoServices();//India
        fh.gynoServices();//India
        fh.orthoServices();//India
        fh.emergencyServices();//Common Service

        fh.medicalRnD();
        fh.medicalNews();

        System.out.println("====Object of Interfaces(cannot be created)======");
        //USMedicalAssociation us= new USMedicalAssociation();
        //UKMedicalAssociation uk= new UKMedicalAssociation();
        //IndianMedicalAssociation in= new IndianMedicalAssociation();

        System.out.println("====Top casting with USMedicalAssociation======");
        USMedicalAssociation usma = new FortisHospital();
        usma.cardioServices();
        usma.neuroServices();
        usma.physioServices();
        usma.emergencyServices();


        System.out.println("====Top casting with UKMedicalAssociation======");
        UKMedicalAssociation ukma = new FortisHospital();
        ukma.entServices();
        ukma.dentalServices();
        ukma.emergencyServices();


        System.out.println("====Top casting with IndianMedicalAssociation======");
        IndianMedicalAssociation ima = new FortisHospital();
        ima.oncoServices();
        ima.gynoServices();
        ima.orthoServices();
        ima.emergencyServices();


        System.out.println("====Top casting with WHO======");
        WHO who = new FortisHospital();
        who.pandemicServices();

        System.out.println("====Trying to create object of Interface - Not Passible");

        //new USMedicalAssociation();
        //new UKMedicalAssociation();
        //new IndianMedicalAssociation();
        //new WHO();
        //new UHO();

    }
}
