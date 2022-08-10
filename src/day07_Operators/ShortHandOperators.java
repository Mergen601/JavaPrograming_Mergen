package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args)
    {
        int num1 = 100;
        System.out.println("num1 = " + num1);
        num1 +=100;
        System.out.println("num1 = " + num1);

        // num1 + = 100// = // num1 = num1 +100;//

        String str = "Hello";
        System.out.println("str = " + str);// Hello//
        str += "  World";
        System.out.println("str = " + str); //Hello World//
        System.out.println("----------------------------------------\n");

        double availableBalance = 1000.50;
        availableBalance +=300;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("-----------------------------------------\n");




        availableBalance -= 500; //1000.50 + 300 =1300;// 1300 -500=800;
        System.out.println("availableBalance = " + availableBalance);
        availableBalance-=200;//Withdrawing 200 dollars;
        System.out.println("availableBalance = " + availableBalance);
        availableBalance+=400;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("---------------------------------\n");
        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary *= 2;         //salary = salary*2//
        System.out.println("salary = " + salary);

        System.out.println("------------------------\n");
        double  dodge = 0.00000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);

        System.out.println("-------------------------\n");
        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("-------------------------\n");
        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);

        System.out.println("-------------------------\n");

        int amount = 127; //cents
        int quarters = amount / 5;
        int cents = amount % 5;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("------------------------\n");
        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("-----------------------\n");
        int y = 300;
        y %= 16;
        System.out.println("y = " + y);










    }
}
