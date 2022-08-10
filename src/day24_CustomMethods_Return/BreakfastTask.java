package day24_CustomMethods_Return;

import day11_Switch_Scanner.ScannerIntro;

import java.util.Scanner;

public class BreakfastTask {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

         intials("Hello","Cydeo");

         System.out.println("-------------------------------------");

         mail("Cydeo.School@gmail.com");

        System.out.println("----------------------------------------");

        String emails [] = {"ihsanenver@gmail.com","Eksan516@amazon.con","gulsen@yahoo.com"};

        for(String eachMail :emails)
        {
            mail(eachMail);
        }

        System.out.println("------------------------------------------");

        System.out.println("Please Enter a number: ");
        nameOfMonth(scan.nextInt());
        //Create a method that can display the name of the month based on the given number to the method
    }

    public static  void intials (String firstName , String lastName) {

        String intial = firstName.charAt(0) +"."+ lastName.charAt(0);
        intial = intial.toUpperCase();
        System.out.println("intial = " + intial);
        /*1. Create a method that can display the initials of the person */

    }

    public static void mail (String mail) {
        String domain = mail.substring(mail.indexOf("@")+1,mail.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    public static void nameOfMonth(int number) {
        String name = " ";
        if(number>=1 && number<=12)
        {
            name  =  (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "March" :(number==4)? "April" :(number==5)? "May"
                    :(number==6)? "June" :(number==7)? "July" :(number==8)? "August" :(number==9)? "September" :(number==10)? "October"
                    :(number==11)? "November" : "December";
        }
        else
        {
            name ="Invalid Number";
        }
        System.out.println("name = " + name);
    }





}
