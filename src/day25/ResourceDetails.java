package day25;

public class ResourceDetails {

    private String fName;
    private String lName;
    private String state;

    public String getfName() {
        return fName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    private String city;
    private int age;

    public ResourceDetails(String fName, String lName, int age, String state, String city) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.state = state;
        this.city = city;
    }

    public ResourceDetails(String fName, String lName, int age) {
        this(fName, lName, age, "NY", "Denes");
        System.out.println("Test ");

    }


}
