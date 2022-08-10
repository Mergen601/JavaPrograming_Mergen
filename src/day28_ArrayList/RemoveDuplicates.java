package day28_ArrayList;

import Utilities.ArrayUtilities;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates
{
    public static void main(String[] args) {


        ArrayList<Character> chars  = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('A');
        chars.add('A');
        chars.add('C');

        System.out.println(chars);

        ArrayList<Character> result = new ArrayList<>();

        for(char each : chars)
        {
            if(!result.contains(each))
            {
                result.add(each);
            }
        }
        System.out.println(result);

    }
}

