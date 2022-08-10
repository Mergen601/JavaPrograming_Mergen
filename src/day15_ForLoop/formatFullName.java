package day15_ForLoop;

import java.util.Scanner;

public class formatFullName
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String firstName = "";
        String lastdName = "";
        String fullName;


        System.out.println("Enter your first Name:");
        firstName = scan.next();
        System.out.println("Enter your las name:");
        lastdName =scan.next();

       firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
       lastdName = lastdName.substring(0,1).toUpperCase() + lastdName.substring(1).toLowerCase();

        fullName = firstName+" "+lastdName;

        System.out.println("fullName = " + fullName);

    }
}
