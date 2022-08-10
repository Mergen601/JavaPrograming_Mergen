package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        //create variable that capable enough to contain 5 names

        String myGroup [] = new String[5];

        myGroup [0] = "Michael";
        myGroup [1] = "Jordan";
        myGroup [2] = "Hulya";
        myGroup [3] = "Tuğba";
        myGroup [4] = "İhsan";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------------------------------------");

        String days [] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Friday"};
        // index:          0          1         2           3         4         5          6  //

        int number  = 1;
        System.out.println(Arrays.toString(days));

        if(number<1 || number>7)
        {
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
















    }
}
