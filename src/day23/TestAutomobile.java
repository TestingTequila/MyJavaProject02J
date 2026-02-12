package day23;

public class TestAutomobile {
    public static void main(String[] args) {
        Automobile auto = new Automobile();
        System.out.println(auto.name);//null
        System.out.println(auto.wheels);//0
        System.out.println(auto.isAutomatic);//false
        System.out.println(auto.canImport);
    }
}
