package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElement
{
    public static void main(String[] args) {

        ArrayList<String> unique = new ArrayList<>();
        unique.add("Java");
        unique.add("Java");
        unique.add("ABİ");
        unique.add("Java");

        for (String each :unique)
        {
            if(unique.indexOf(each) == unique.lastIndexOf(each))
                System.out.println(each);
        }


        System.out.println("----------------------------------");

        ArrayList<Character> chars  = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');

        boolean r1 = chars.contains('A');
        System.out.println(r1);


    }
}
