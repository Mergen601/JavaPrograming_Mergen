package day11_Switch_Scanner;

public class PassOrFailed
{
    public static void main(String[] args)
    {
        char score = 'G';
        String result = "";

        switch (score)
        {
            case 'A':
                result = "Excellent";
            break;

            case 'B':
                result = "Great job";
            break;

            case 'C':
                result = "Good";
            break;

            case 'D':
                result = "Passed";
            break;

            case  'F':
                result ="Failed";
            break;

            default:
                result = "Invalid Number";
            break;

        }

              System.out.println(result);



    }
}
