package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_NextLine
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String number = scan.nextLine();
        System.out.println("Enter your programing language:");
        String javaPrograming = scan.nextLine();
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        scan.nextLine();//Enter key// we use this to capture enter key//
        System.out.println("Enter your school name:");
        String schoolName = scan.nextLine();



        System.out.println("number = " +number);
        System.out.println("javaPrograming = " + javaPrograming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);



        scan.close();

    }
}
