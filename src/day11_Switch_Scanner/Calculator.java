package day11_Switch_Scanner;


public class Calculator
{
    public static void main(String[] args)
    {
        double n1 = 2.25;
        double n2 = 3.26;
        char operator = '*';



        boolean validOperator = operator == '+' || operator == '-' || operator == '*' ||  operator == '-';
        if(validOperator)
        {
            switch (operator)
            {
                case '+':
                    System.out.println(n1+n2);
                break;

                case '-':
                    System.out.println(n1-n2);
                break;

                case '*':
                    System.out.println(n1*n2);
                break;

                default:
                    System.out.println(n1/n2);
                break;

            }


        }
        else
        {
            System.err.println("Invalid " +operator);
        }


    }
}
