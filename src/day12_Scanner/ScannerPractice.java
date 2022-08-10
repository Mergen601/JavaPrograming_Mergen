package day12_Scanner;
import java.util.Scanner;

public class ScannerPractice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1-7:");
        int number = scan.nextInt();
        String result = "";

        if(number>=1 && number<=7)
        {
            switch (number)
            {
                case 1:
                     result = "Mondat";
                break;
            }

        }
        else
        {
            System.out.println("Invalid Number");
        }



    }
}
