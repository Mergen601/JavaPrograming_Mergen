package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatement
{
    public static void main(String[] args) {

        for(char i = 'A'; i<='Z'; i++)
        {
            if(i=='F')
            {
                break; //Exits loop;
            }

            System.out.print(i+" ");


        }

        System.out.println("\n");
        System.out.println("----------------------------");
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter a number");
            int a = scan.nextInt();

            if(a<0)
            {
                break;
            }
        }
        scan.close();
    }
}
