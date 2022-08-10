package day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueCharacters
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);

        String str ;
        String result = "";
        String ch = "";

        System.out.println("Enter characters:");
        str = scan.next();


        for(int i = 0; i<str.length(); i++)
        {

              ch = ""+ str.charAt(i);


            if(str.indexOf(ch) == str.lastIndexOf(ch))
           {
               result+= ch;
           }

        }

        System.out.println("Unique character is: "+result);

        int i = 3/2;
        System.out.println("i = " + i);









    }
}
