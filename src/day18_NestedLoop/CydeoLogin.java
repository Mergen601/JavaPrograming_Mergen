package day18_NestedLoop;

import java.util.Scanner;

public class CydeoLogin
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName = "Cydeo";
        String passWord= "WoodenSpoon";

        String input1 = "";
        String input2 = "";

        System.out.println("Please enter your user name:");
        input1 = scan.next();
        System.out.println("Please enter your password:");
        input2 = scan.next();

        if(userName.equals(input1) && passWord.equals(input2))
        {
            System.out.println("Logged in");
        }

        int attempt =0;

        while (!userName.equals(input1) || !passWord.equals(input2) && attempt<3)
        {
            System.err.println("WRONG PASSWORD OR USERNAME");
            System.out.println("Please enter your user name:");
            input1 = scan.next();
            System.out.println("Please enter your password:");
            input2 = scan.next();
            attempt++;
             if(attempt>3)
             {
                 System.out.println("locked");
                 break;
             }
            else if(userName.equals(input1) && passWord.equals(input2))
             {
                 System.out.println("Logged in");
                 break;
             }



        }









    }
}
