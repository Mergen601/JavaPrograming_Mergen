package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilities
{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);


        System.out.println("-------------------");

        ArrayList<Character> ch = new ArrayList<>();
        ch.addAll(Arrays.asList('A','B','C','D','E','F'));

        System.out.println(ch);


        Collections.reverse(ch);
        System.out.println(ch);

        System.out.println("----------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60,70,80));
        System.out.println(list2);

        Collections.swap(list2,1,4);
        System.out.println(list2);

        System.out.println("-----------------------");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70,80));

        System.out.println("Collections.max(list3) = " + Collections.max(list3));
        System.out.println("Collections.min(list3) = " + Collections.min(list3));

        System.out.println("---------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4,10,100);
        System.out.println(list4);

        System.out.println("--------------------");
        int frequency = Collections.frequency(list4,100);
        System.out.println("frequency = " + frequency);

        System.out.println("-------------------------");

        ArrayList<String> word = new ArrayList<>();
        word.addAll(Arrays.asList("Java","Java","Pyhton","Python","Ruby","C++"));

        int countJava = Collections.frequency(word,"Java");
        int countPython = Collections.frequency(word,"Python");

        




    }
}
