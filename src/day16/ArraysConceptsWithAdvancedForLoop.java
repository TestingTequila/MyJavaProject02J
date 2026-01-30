package day16;

public class ArraysConceptsWithAdvancedForLoop {
    public static void main(String[] args) {
        // I love Java, I love Selenium, I love TestNG, I Love Jenkins, I Love Kubernetes
        // Today's Deals, Prime Video, Registry, Gift Cards, Customer Service, Sell
        // 12, 14, 56, 67,87,20
        // a, e, i, o, u
        // true, false, false, false, true
        // Apple, Oranges, Grapes, Papaya,Banana

        //String fruit = "Pineapple";
        //System.out.println(fruit);//Pineapple

        System.out.println("==================fruits[]======================");

        String[] fruits = {"Apple", "Oranges", "Grapes", "Papaya", "Banana"};
        for (String f : fruits) {
            System.out.println(f);//Apple, Oranges, Grapes,, Papaya, Banana
        }

        System.out.println("==================alternate fruits[]======================");
        int q = 0;
        while (q < fruits.length) {
            if (fruits[q].equals("Grapes")) {
                System.out.println("Don't want to eat this....");
                break;
            }
            System.out.println(fruits[q]);//Apple
            q = q + 2;
        }

        System.out.println("==================check[]======================");

        boolean[] check = {true, false, false, false, true};

        for (boolean c : check) {
            System.out.println(c);
        }

        System.out.println("==================vowels[]======================");

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char v : vowels) {
            System.out.println(v);
            ;
        }


        System.out.println("==================marks[]======================");

        int[] marks = {12, 14, 56, 67, 87, 20, 55, 66, 77, 89};

        for (int m : marks) {
            System.out.println(m);
        }


        System.out.println("==================statements[]======================");

        String[] statements = {"I like Java", "I like Selenium", "I like TestNG", "I like Jenkins", "I like Kubernetes"};
        for (String s : statements) {
            if (s.equals("I like Jenkins")) {
                System.out.println("I Hate Jenkins");
                break;
            }
            System.out.println(s);
        }

    }
}
