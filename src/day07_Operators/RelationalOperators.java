package day07_Operators;

public class RelationalOperators
{
    public static void main(String[] args)
    {
        System.out.println("\"-----Relational Operators-----\"\n");

        boolean result1 = 25>30;
        System.out.println("result1 = " + result1);

        boolean result2 = 300>=100;
        System.out.println("result2 = " + result2);

        boolean result3 = 100>=100;
        System.out.println("result3 = " + result3);

        boolean result4 = 400>=500;
        System.out.println("result4 = " + result4);

        System.out.println("----------------------------------");
        //credit score 720
        int creditScore = 745;
        boolean isEligbleForLoan = creditScore >= 720;
        System.out.println("isEligbleForLoan = " + isEligbleForLoan);

        System.out.println("----------------------------------");
        //hasfailed
        int score = 75;
        boolean hasFailed = 75<45;
        System.out.println("hasFailed = " + hasFailed);

        System.out.println("----------------------------------");
        int x =100, y= 200;
        boolean equal = x == y; //false
        System.out.println("equal = " + equal);

        System.out.println("---------------------------------");

        boolean Writen = "Muhtar" == "İhsan";
        System.out.println("Writen = " + Writen);

        System.out.println("----------------------------------");
        boolean resul6 = 100 != 200;
        System.out.println("resul6 = " + resul6);





    }
}
