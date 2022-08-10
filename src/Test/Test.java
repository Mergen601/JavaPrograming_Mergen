package Test;

import Utilities.StringUtilities;

public class Test
{
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        StringUtilities.printEachChar(str);

        String str1 = "Hello Cydeo";
        StringUtilities.printEachChar(str1);

        System.out.println("\n----------------------");

        str = StringUtilities.reverse(str);
        boolean isPalindrome = StringUtilities.isPalindrome(str);
        System.out.println("isPalindrome = " + isPalindrome);
        System.out.println(StringUtilities.isPalindrome(str1));

        System.out.println("----------------------------------");

        String names [] = {"Anna","Java","Python","racecar","mom","Cydeo"};
        int count = 0;
        for (String eachNames : names)
        {
              if(StringUtilities.isPalindrome(eachNames))
              {
                  count++;
              }

        }

        System.out.println(count);

        System.out.println("-------------------------------------------");

        boolean str3 = StringUtilities.isAnagram("listen","Netlis");
        System.out.println(str3);

        System.out.println("-------------------------------------------");

        String duplicatedAlphabet  = "aaaabbbbcddd";
        duplicatedAlphabet = StringUtilities.removeDuplicates(duplicatedAlphabet);
        System.out.println(duplicatedAlphabet);


    }
}
