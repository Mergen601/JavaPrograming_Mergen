package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result=0;

        System.out.println("Please enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Please enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Please enter math operator:");
        char opr = scan.next().charAt(0);

        while(opr != '+' &&  opr != '-')
        {
            System.err.println("Invalid Operator,Please renter:");
            opr = scan.next().charAt(0);
        }

        System.out.println((opr=='+')? num1+num2 : num1-num2);




    }
}
