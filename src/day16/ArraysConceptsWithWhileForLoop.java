package day16;

public class ArraysConceptsWithWhileForLoop {
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
        System.out.println(fruits.length);

//        int i=0;
//        while (i<fruits.length)
//        {
//            System.out.println(fruits[i]);//Apple, Oranges, Grapes, Papaya, Banana
//            i++;
//        }


        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);//Apple, Oranges, Grapes, Papaya, Banana

        }

        System.out.println("==================check[]======================");

        boolean[] check = {true, false, false, false, true};
        System.out.println(check.length);

        int j = 0;
        while (j < check.length) {
            System.out.println(check[j]);
            j++;
        }


        System.out.println("==================vowels[]======================");

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(vowels.length);

        System.out.println("==================marks[]======================");

        int[] marks = {12, 14, 56, 67, 87, 20, 55, 66, 77, 89};
        System.out.println(marks.length);
        int k = 0;
        while (k <= marks.length) {
            System.out.println(marks[k]);
            k++;
        }

        System.out.println("==================statements[]======================");

        String[] statements = {"I like Java", "I like Selenium", "I like TestNG", "I like Jenkins", "I like Kubernetes"};
        System.out.println(statements.length);

        int l = 0;
        while (l < statements.length) {
            System.out.println(statements[l]);
            l++;
        }

    }
}
