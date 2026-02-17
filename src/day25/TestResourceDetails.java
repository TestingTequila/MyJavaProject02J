package day25;

public class TestResourceDetails
{
    public static void main(String[] args) {
       ResourceDetails details = new ResourceDetails("Jason", "Roger", 24);

        System.out.println(details.getfName());//Jason
        System.out.println(details.getlName());//Roger
        System.out.println(details.getAge());//24
        System.out.println(details.getState());//NY
        System.out.println(details.getCity());//Denes
    }
}
