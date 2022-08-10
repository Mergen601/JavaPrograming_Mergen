package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro
{
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal: ");
        double number = scan.nextDouble();
        System.out.println("Enter a integer");
       double number2 = scan.nextDouble();

        System.out.println("multiply: "+number*number2);
        System.out.println(3695%60);



        scan.close();













    }
}
