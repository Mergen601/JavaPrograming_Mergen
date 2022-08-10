package Utilities;

import java.util.Arrays;

public class StringUtilities {


    // print  the chars in the string
    public static void printEachChar(String word)
    {
        word = word.trim();
        for (int i=0 ; i<word.length();i++)
        {

            System.out.print(word.charAt(i)+" ");
        }
    }


    // reverse the string
    public static String reverse(String word)
    {
        String result = "";

        for(int i=word.length()-1; i>=0;i--)
        {
             result += word.charAt(i);
        }

        return  result;
    }

    // check the word is palindrome
    public static boolean isPalindrome (String str)
    {
      return  reverse(str).equalsIgnoreCase(str);
    }


    //check if the given string is anagram, returns boolean
    public static boolean isAnagram (String str1,String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char ch1 [] = str1.toCharArray();
        char ch2 [] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        return Arrays.equals(ch1,ch2);

    }


    //removeDuplicates "aaaabbccdd" ==> "abcd"
    public static String removeDuplicates (String str)
    {
        String result = "";
        for(int i= 0; i<str.length();i++)
        {
            char each = str.charAt(i);//aaaabbbcccdd
            if(!result.contains(""+each))
            {
                result += each;
            }

        }
        return result;

    }


    //checkPassWord
    public  static boolean isStrongPassword (String password)
    {
        boolean  r1  =  password.length() >=8 && !password.contains(" ");
        boolean  r2  = false; // hasUpperCase
        boolean  r3 =  false; // hasLowerCase
        boolean  r4 =  false; // hasDigit
        boolean  r5 =  false; // hasSpecialChars

        char arr [ ] = password.toCharArray();


        for(char each : arr)
        {
            if(Character.isUpperCase(each))
            {
                r2 = true;
            }
            else if(Character.isLowerCase(each))
            {
                r3 = true;
            }
            else  if(Character.isDigit(each))
            {
                r4 = true;
            }
            else
            {
                r5 =true;
            }
        }


        Boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return  isStrongPassword;

    }

}
