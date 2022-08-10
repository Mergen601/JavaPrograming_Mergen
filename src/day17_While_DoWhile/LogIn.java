package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = "Cydeo";
        String PassWord= "Cydeo123";

        System.out.println("please enter your userName:");
        String enteredUserName = scan.next();

        System.out.println("Please Enter Your Password:");
        String enteredPassWord = scan.next();

        if(userName.equals(enteredUserName) && PassWord.equals(enteredPassWord))
        {
            System.out.println("Logged In");
        }
        else
        {
            int attempt = 3;
            while (!userName.equals(enteredUserName) && !PassWord.equals(enteredPassWord) && attempt>0)
            {
                if(attempt ==1)
                {
                    System.err.println("This is your last chance");
                }
                System.err.println("User name or password is incorrect, please reenter");
                System.out.println("Please Enter Your userName:");
                enteredUserName = scan.next();
                System.out.println("Please Enter Your Password");
                enteredPassWord = scan.next();
                attempt--;
            }
            if(userName.equals(enteredUserName) && PassWord.equals(enteredPassWord))
            {
                System.out.println("Loged In");
            }
            else
            {
                System.out.println("Your account is locked");
            }

        }




    }
}
