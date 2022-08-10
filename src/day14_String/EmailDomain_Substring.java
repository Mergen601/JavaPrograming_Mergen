package day14_String;

import java.util.Scanner;

public class EmailDomain_Substring
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your mail addrees:");
        String mail = scan.next();

        String output = mail.substring(mail.indexOf("@")+1,mail.indexOf("."));
        System.out.println("Your mail domain is "+output);




    }

}
