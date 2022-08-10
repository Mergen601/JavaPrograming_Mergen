package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {


            System.out.println("Enter Your Age: ");
            int age = scan.nextInt();


            while (!(age >= 1 && age <= 120)) {
                System.err.println("Invalid age");
                System.out.println("Please renter:");
                age = scan.nextInt();
            }

            System.out.println("Would you like to continue:(Yes/No)");
            String ans = scan.next().toLowerCase();

            while(!(ans.equals("yes") || ans.equals("no"))) {

                System.err.println("Invalid answer,would you like to continue?");
                ans = scan.next().toLowerCase();
            }

            if(ans.equals("no"))
            {
                break;
            }



        }

    }
}
