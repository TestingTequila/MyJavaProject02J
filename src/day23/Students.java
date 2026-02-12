package day23;

public class Students {
    private String fName;
    private String lName;
    private char gender;
    private int age;
    private boolean hasOptedJavaCourse;

    public Students(String fName, String lName, char gender, int age, boolean hasOptedJavaCourse) {

        this.fName = "Jason";
        this.lName = "Roger";
        this.gender = 'M';
        this.age = 23;
        this.hasOptedJavaCourse = true;
    }


    public Students(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Students(String fName, String lName, char gender) {
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
    }

    public Students(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public Students(char gender, int age, boolean hasOptedJavaCourse) {
        this.gender = gender;
        this.age = age;
        this.hasOptedJavaCourse = hasOptedJavaCourse;
    }

    public void printValues() {
        System.out.println("fName: " + fName);
        System.out.println("lName: " + lName);
        System.out.println("gender: " + gender);
        System.out.println("age: " + age);
        System.out.println("hasOptedJavaCourse: " + hasOptedJavaCourse);
    }
}
