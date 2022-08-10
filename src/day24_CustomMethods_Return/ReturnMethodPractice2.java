package day24_CustomMethods_Return;

public class ReturnMethodPractice2
{
    public static void main(String[] args) {


       String str1 =  grade(-100);

       if(str1.equals("A"))
       {
           System.out.println("Excellent");
       }
       else if(str1.equals("B"))
       {
           System.out.println("Great");
       }
       else if (str1.equals("C"))
       {
           System.out.println("Good");
       }
       else if(str1.equals("D"))
       {
           System.out.println("Passsed");
       }
       else if (str1.equals("F"))
       {
           System.out.println("Try again");
       }
       else
       {
           System.out.println("Result = " + str1);
       }


        // create the function calculate grade


        /*

                  Check the grade
                     'A' ===> Excellent
                     'B' ===>Great
                     'C' ===>Good
                     ......
                     

         */
    }

    public static String grade (int score)
    {

         String result = "";

         if(score<0 || score>100)
         {
             result = "Invalid";
         }
         else
         {
             result = (score>=90)? "A" :(score>=80) ?"B" :(score>=70)?"C" :(score>=60)? "D" :"F";
         }


         return  result;

    }
}
