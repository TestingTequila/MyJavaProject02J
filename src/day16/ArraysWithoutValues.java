package day16;

public class ArraysWithoutValues {
    public static void main(String[] args) {
        //I want to store marks of 7 students
        int[] marks = new int[7];

        System.out.println(marks[3]);//0

        for (int m : marks) {
            System.out.println(marks[m]);//0,0,0,0,0
        }

        System.out.println("=====After Value is assigned======");
        marks[3]=50;

        for (int m : marks) {
            System.out.println(m);//0,0,0,50,0
        }




        // I want to store names of 6 students
        String[] names = new String[6];
        names[2] = "Namrah";
        for(String n : names)
        {
            System.out.println(n);
        }
    }
}
