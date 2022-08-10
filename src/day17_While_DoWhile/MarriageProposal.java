package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me ? Yes/No");
        String a = scan.next().toLowerCase();
        if(a.equals("yes"))
        {
            System.out.println("congrates");
        }
        else
        {
            System.out.println("Good bye");
        }


        while(!(a.equalsIgnoreCase("yes")) )
        {
            System.err.println("Please renter");
            a = scan.next().toLowerCase();

        }



        scan.close();



    }
}
