package day23;

public class Kyc2 {
    private static String customerName;
    private static String sSn;
    private static String cCNumber;
    private static int cvv;

    public static String getCustomerName() {
        return customerName;
    }

    public static void setCustomerName(String customerName) {
        Kyc2.customerName = customerName;
    }

    public static String getsSn() {
        return sSn;
    }

    public static void setsSn(String sSn) {
        Kyc2.sSn = sSn;
    }

    public static String getcCNumber() {
        return cCNumber;
    }

    public static void setcCNumber(String cCNumber) {
        Kyc2.cCNumber = cCNumber;
    }

    public static int getCvv() {
        return cvv;
    }

    public static void setCvv(int cvv) {
        Kyc2.cvv = cvv;
    }
//    private Kyc(String customerName, String sSn, String cCNumber, int cvv) {
//        this.customerName = customerName;
//        this.sSn = sSn;
//        this.cCNumber = cCNumber;
//        this.cvv = cvv;
//    }

    private Kyc2() {
        //nobody can create object of this class.
    }

}
