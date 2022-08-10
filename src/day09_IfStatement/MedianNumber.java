package day09_IfStatement;

public class MedianNumber
{
    public static void main(String[] args)
    {
        int a = -8888, b = -88, c = 20;

        boolean bIsMedianNumber = (b>a && b<c) || (b<a && b>c);
        boolean aIsMedianNumber = (a>b && a<c) || (a<b && a>c);
        boolean cIsmedianNumber = (c>b && c<a) || (c<b && c>a);
        boolean isEqual = !aIsMedianNumber && !bIsMedianNumber &&!cIsmedianNumber;
        String result = "";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


        if (bIsMedianNumber)
        {
             result = " is median number";

        }
        if(aIsMedianNumber)
        {
            System.out.println(a+ " is median number");
        }
        if (cIsmedianNumber)
        {
            System.out.println(c+ " is median number");
        }
        if (isEqual)
        {
            System.out.println("THERE İS NO MEDİAN NUMBER");
        }






    }
}
