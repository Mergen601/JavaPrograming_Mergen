package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int minimumNumber = 2147483647;

        for(int i = 1; i<=5;i++)
        {
            System.out.println("Enter your number");
            int number = scan.nextInt();

            if(number<minimumNumber)
            {
                minimumNumber=number;
            }
        }
        System.out.println("minimumNumber = " + minimumNumber);
    }
}
