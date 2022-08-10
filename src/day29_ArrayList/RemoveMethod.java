package day29_ArrayList;

import Utilities.StringUtilities;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMethod
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeIf(p -> p<5); //lAMBDA EXPRESSİON
        System.out.println(list);

        System.out.println("--------------------------");

        ArrayList<Integer> list2  = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(p -> p%2==0);
        System.out.println(list2);

        System.out.println("--------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java"));
        list3.removeIf(p -> p.startsWith("J") && p.endsWith("a"));
        System.out.println(list3);

        System.out.println("--------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python","Cydeo"));
        names.removeIf(p-> !StringUtilities.isPalindrome(p));
        System.out.println(names);













    }
}
