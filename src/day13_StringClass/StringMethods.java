package day13_StringClass;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String word = "Cydeo";
        char firsCharacter =  word.charAt(0);
        System.out.println(firsCharacter);
        char secondCharacter = word.charAt(1);
        System.out.println(secondCharacter);
        char thirdCharacter = word.charAt(2);
        System.out.println(thirdCharacter);
        char fourthCharacter = word.charAt(3);
        System.out.println(fourthCharacter);
        char fifthCharacter = word.charAt(4);
        System.out.println(fifthCharacter);

        System.out.println("--------------------");
        String s1 = "My name is ihsan";
        int num = s1.length();
        System.out.println(num);
        char lastNumber = s1.charAt(num-1);
        System.out.println(lastNumber);
        System.out.println();

        System.out.println("-------------------------");
        s1 = s1.toUpperCase(Locale.ROOT);
        System.out.println(s1);

        String s = "java";
        s = s.toUpperCase();
        System.out.println(s);

        String sentence = "To day is a great day to learn java programming language";
        sentence = sentence.toUpperCase();
        System.out.println(0.15+0.5);
        

         



    }
}
