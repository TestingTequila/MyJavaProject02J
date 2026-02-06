package day21.Oops_Ploymorphism;

public class TestApplication
{
    public static void main(String[] args) {
        Application app= new Application();
        app.addition(12,8);

        Application app1= new Application();
        app1.addition(12,45.67);

        Application app2= new Application();
        app2.addition(12.45F,8.45, 10);

        app2.addition(12.34, 56.78F);

        app2.addition(12.34F, 89.76);
        //app2.addition(12.34F, 56.67, 23.45);//Compile time Error
        //System.out.println(10/0);//Run time Exception


    }



}
