package day19_LoopPractice;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = scan.nextInt();
        System.out.println("Enter second numver: ");
        int n2 = scan.nextInt();

        System.out.println("Choose \n 1.+\n 2.- \n 3.* \n 4./");
        int chooce  = scan.nextInt();

        if(chooce == 1)
        {
            System.out.println(n1+n2);
        }



    }

}
