package day21_ArrayUtility;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";



        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        Arrays.sort(ch1);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println(anagram);


        System.out.println("-------------------------------");


        String sentence ="Wooden Spoon";
        String array []= sentence.split(" ");
        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------");
        String email = "ihsanenver516@gmail.com";
        String array1 [] = email.split("@");
        System.out.println(Arrays.toString(array1));

        System.out.println("--------------------------------");
        String s = "Today is nice day. Today is monday. Today we learning java";
        String sentences [] = s.split("\\. ");
        System.out.println(Arrays.toString(sentences));
        


    }
}
