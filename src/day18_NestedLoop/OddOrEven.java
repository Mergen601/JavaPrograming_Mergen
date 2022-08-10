package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.println("Please enter a number:");
            int num = scan.nextInt();
            if(num%2==0)
            {
                System.out.println(num+" is even");
            }
            else
            {
                System.out.println(num+" is odd");
            }
            System.out.println("Would you like to continue:");
            String ans = scan.next().toLowerCase();

            while (!(ans.equals("yes") || ans.equals("no")))
            {
                System.err.println("Invalid answer, would you like to continue ?");
                ans = scan.next();
            }

            if(ans.equals("no"))
            {
                break;
            }
        }
    }
}
