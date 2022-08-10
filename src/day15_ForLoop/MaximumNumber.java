package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int maxNumber = -2147483648;

        for (int i=1;i<=5;i++)
        {
            System.out.println("Please Enter Your Number:");
            int number  = scan.nextInt();

            if(number>maxNumber)
            {
                maxNumber = number;
            }

        }

        System.out.println("maxNumber = " + maxNumber);

    }
}
