package day23;

public class TestKyc2 {
    public static void main(String[] args) {
        Kyc2.setCustomerName("Jason");
        Kyc2.setcCNumber("4564565");
        Kyc2.setsSn("56546");
        Kyc2.setCvv(123);

        System.out.println(Kyc2.getCustomerName());
        System.out.println(Kyc2.getcCNumber());
        System.out.println(Kyc2.getsSn());
        System.out.println(Kyc2.getCvv());
    }
}
