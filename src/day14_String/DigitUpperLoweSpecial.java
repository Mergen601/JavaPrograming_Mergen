package day14_String;

import java.util.Scanner;
import java.lang.String;

public class DigitUpperLoweSpecial
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String word = scan.next();

        char firstChar = word.charAt(0);
        String result = "";

        if(firstChar>='0' && firstChar<='9')
        {
            result = "first character is digit";
        }
        else if(firstChar>='a' && firstChar<='z')
        {
            result = "first character is lower case letter";
        }
        else if(firstChar>='A' && firstChar<='Z')
        {
            result = "first character is upper case";
        }
        else
        {
            result = "first character is special character";
        }

        System.out.println(result);



    }
}
