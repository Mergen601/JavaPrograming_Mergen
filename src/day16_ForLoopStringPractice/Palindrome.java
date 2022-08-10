package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String reversed = "";




        System.out.println("Enter the word:");
        String str = scan.next();

        for(int i =str.length()-1; i>=0;i--)
        {
            reversed += str.charAt(i);
        }

        boolean isPalindrome = str.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
