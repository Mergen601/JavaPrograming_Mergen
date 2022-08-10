package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTask {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,5,4,2,3,0,6,7,0,8,9,0));
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);


        int arr [] = {1,2,3,4,5,6,7,8};
        // System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0,5));

        int size = list2.size();
        list2.removeAll(Arrays.asList(0));

        int newSize = list2.size();

        int totalNumberOfZero = size - newSize;

        for (int i = 0; i < totalNumberOfZero; i++)
        {

            list2.add(0);

        }

        System.out.println(list2);


        System.out.println("-------------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,0,2,0,3,0,4,0,5));

        int oldSize = list3.size();

        ArrayList<Integer> result = new ArrayList<>();

        for(int each :list3)
        {
            if(each != 0)
            {
                result.add(each);
            }
        }

        for(int each : list3)
        {
            if (each == 0)
            {
                result.add(each);
            }
        }
        System.out.println(result);

        System.out.println("-------------------------------------------------");

        String str = "ABCD123$&#@&456FG";

         ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++)
        {
            chars.add(str.charAt(i));

        }

        ArrayList<Character> newWord = new ArrayList<>(chars);

        newWord.removeIf(p -> !(Character.isDigit(p)));
        System.out.println("Digit= "+newWord);

        ArrayList<Character> isLetter = new ArrayList<>(chars);
        isLetter.removeIf(p -> !Character.isLetter(p));
        System.out.println("isletter ="+isLetter);

        ArrayList<Character> isSpecial = new ArrayList<>(chars);
        isSpecial.removeIf(p -> Character.isLetterOrDigit(p));
        System.out.println("isspecial ="+isSpecial);









    }
}
