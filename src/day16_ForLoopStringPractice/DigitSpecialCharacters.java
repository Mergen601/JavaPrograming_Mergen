package day16_ForLoopStringPractice;

import java.util.Scanner;

public class DigitSpecialCharacters
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the letters: ");
        String str = scan.next();

       String digits=""; //12345
        String letters = "";//cydeo
         String specialChars = ""; //@%+&++


        for(int i = 0; i<str.length(); i++)
        {   // index number of str from zero til last index
            char ch = str.charAt(i);
            str = str.toLowerCase();

            if(ch>= '0' && ch<= '9')
            {
               digits += ch;

            }
            else if (ch>= 'a' && ch<= 'z')
            {
              letters += ch;
            }
            else
            {
                specialChars += ch;
            }




        }

            System.out.println("letters = " + letters);
            System.out.println("specialChars = " + specialChars);
            System.out.println("digits = " + digits);















    }
}
