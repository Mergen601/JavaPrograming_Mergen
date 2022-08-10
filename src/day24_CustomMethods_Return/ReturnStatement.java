package day24_CustomMethods_Return;

import java.util.Scanner;

public class ReturnStatement
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of day: ");
        nameOfDay(scan.nextInt());

    }
    public static void nameOfDay(int number)
    {
        if(number< 1 || number>7)
        {
            return;
            // exits nameOfDay method;
        }
        if (number==1)
        {
            System.out.println("Monday");
        }
        else if (number==2)
        {
            System.out.println("Tuesday");
        }
        else if(number==3)
        {
            System.out.println("Wednesday");
        }
        else if(number==4)
        {
            System.out.println("ThursDay");
        }
        else if(number==5)
        {
            System.out.println("Friday");
        }
        else if(number==6)
        {
            System.out.println("Saturday");
        }
        else
        {
            System.out.println("Sunday");
        }
    }
}
