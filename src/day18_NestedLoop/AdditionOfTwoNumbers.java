package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);




        while(true)
        {
            System.out.println("Enter number1:");
           int n1 = scan.nextInt();
            System.out.println("Enter number2");
            int n2 = scan.nextInt();

            System.out.println("Addition is: "+(n1+n2));
            System.out.println("Would you like to continue? Yes/No");
            String user = scan.next().toLowerCase();


             while(!(user.equals("yes")|| user.equals("no")) )
             {
                 System.err.println("Wrong answer");
                 System.out.println("Would you like to continue? Yes/No");
                 user = scan.next().toLowerCase();
             }

             if (user.equals("no"))
            {
                break;
            }
        }




    }
}
