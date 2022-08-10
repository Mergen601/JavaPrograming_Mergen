package day11_Switch_Scanner;

public class NumberOfDays
{
    public static void main(String[] args)
    {
        int number = 2;
        int year = 2000;
        String result = "";
        if (number>=1 && number<=12 )
        {
            switch (number)
            {
                case 2:
                    if (year%4 == 0)
                    {
                        result = "29 days";
                    }
                    else
                    {
                        result = "28 days";
                    }
                break;

                case 4: case 6: case 9: case 11:
                    result = "30 days";
                break;

                default:
                    result = "31 days";
                break;
            }

        }
        else
        {
            result = "Invalid Number";

        }


        System.out.println(result);



    }
}
