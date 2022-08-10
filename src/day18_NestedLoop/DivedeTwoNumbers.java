package day18_NestedLoop;

import java.util.Scanner;

public class DivedeTwoNumbers
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = scan.nextInt();

        int count = 0;

        while(num1 >= num2)
        {
            num1 -= num2;
            count++;

        }

        System.out.println(count+" remainder of "+num1);








        scan.close();
















        /* 1.  Write a program that can divide two positive numbers without using
        / (division) and * (multiplication) and % operators
         */

    }
}
