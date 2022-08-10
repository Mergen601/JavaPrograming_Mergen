package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter True/False:");
        Boolean result = scan.nextBoolean();

        System.out.println("-----------------------------");
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("name = " + name);





    }
}
