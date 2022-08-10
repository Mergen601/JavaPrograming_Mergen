package day10_NestedIfStatement;

import jdk.swing.interop.SwingInterOpUtils;

public class NumberToWord
{
    public static void main(String[] args)
    {
        int number = 6;
        String result = (number>=0 && number<=9)?
                (number==0)? "zero" :(number==1)? "one" :(number==2)? "two" :(number==3)? "three"
                :(number==4)? "four" :(number==5)? "five" :(number==6)? "Six" :(number==7)? "Seven" :(number==8)?
                "Eight" :"Nine" : "Invalid number";
        System.out.println(result);
    }
}
