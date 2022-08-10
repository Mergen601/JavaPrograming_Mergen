package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        while (!(age>0 ||age<150))
        {
            System.err.println("Invalid age, please renter your age:");
            age = scan.nextInt();
        }

        System.out.println("Are you Us citizen? Yes/No");
        String citizen = scan.next().toLowerCase();

        while(!(citizen.contains("yes") || citizen.contains("no")))
        {
            System.err.println("renter you answer");
            citizen = scan.next().toLowerCase();

        }



    }
}
