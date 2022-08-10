package day10_NestedIfStatement;

public class CrewAndPassengers
{
    public static void main(String[] args)
    {


        int number = 80;
     String result = "";

     boolean validNumber = number == 50 || number == 75 || number == 100;
     if(validNumber)
     {
         if(number==50)
         {
             result = "20 crew, 30 passenger";
         }
         else if(number == 75)
         {
             result = "25 crew, 50 passenger";
         }
         else
         {
             result = "30 crew, 70 passenger";
         }
     }
     else
     {
         result = "Invalid Number";
     }

        System.out.println(result);

    }
}
