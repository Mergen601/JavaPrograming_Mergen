package day10_NestedIfStatement;

public class NameOfMonth
{
    public static void main(String[] args) {

        int num =12;
        String result = "";

        if(num>=1 && num<=12)
        {
            if (num == 1)
            {
                result = " january";
            }
            else if( num == 2)
            {
                result = "February";
            }
            else if (num == 3)
            {
                result = "March";
            }
            else if (num == 4)
            {
                result = "April";
            }
            else if (num == 5)
            {
                result = "May";
            }
            else if (num == 6)
            {
                result = "june";
            }
            else if(num == 7)
            {
                result = "july";
            }
            else if (num == 8)
            {
                result = "August";
            }
            else if (num == 9)
            {
                result = "September";
            }
            else if ( num == 10)
            {
                result = "October";
            }
            else if ( num == 11 )
            {
                result = "November";
            }
            else if( num == 12)
            {
                result = "December";
            }

        }
        else
        {
         result ="INVALID";
        }

        System.out.println(result);


        System.out.println("------------------------------------------");
        int number = 14;
        String result2 = (number==1)? "January" :(number==2)? "February" :(number==3)? "March" :(number==4)? "April"
                :(number==5)? "May" :(number==6)? "june" :(number==7)? "July" :(number==8)? "August" :(number==9)?
                "September" :(number==10)? "October" :(number==11)? "November" :(number==12)? "December":
                "Invalid Number";

        System.out.println(result2);









    }
}
