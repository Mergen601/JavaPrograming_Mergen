package day15_ForLoop;

import java.util.Scanner;

public class sumOfNumbers
{
    public static void main(String[] args)
    {

       int sum = 0;

        for(int i=1; i<=100;i++)
        {
            sum +=i;
        }

        System.out.println(sum);

        System.out.println("----------------------------------------");

        Scanner scan = new Scanner(System.in);
        int total =0;

        for (int i=1; i<=5;i++)
        {
            System.out.println("Please Enter Number: ");
            total += scan.nextInt();
        }

        System.out.println("total = " + total);

    }
}
