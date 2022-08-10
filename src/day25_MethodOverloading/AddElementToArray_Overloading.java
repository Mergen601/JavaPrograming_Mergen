package day25_MethodOverloading;

import java.util.Arrays;

public class AddElementToArray_Overloading
{
    public static void main(String[] args) {

        int integerArray [] = {10,20,33,43,55};

        integerArray = addElement(integerArray,70);
        System.out.println(Arrays.toString(integerArray));

        double doubleArray [] = {10.2,20.2,33.3,43.5,55.0};
        doubleArray = addElement(doubleArray,5.5);
        System.out.println(Arrays.toString(doubleArray));

        String stringArray [] = {"Ahmet","Mehmet","Herlock"};
        stringArray  = addElement(stringArray,"SHOLMES");
        System.out.println(Arrays.toString(stringArray));

        char charArray [] = {'A','B','C','D','E'};
        charArray = addElement(charArray,'F');
        System.out.println(Arrays.toString(charArray));


    }

    public static int [] addElement (int arr [],int element)
    {
         int  result [] = new int[arr.length+1];

         int i = 0;

         for(int each : arr )
         {
             result[i] =each;
             i++;
         }

         result[i] = element;
         return result;


    }

    public static double [] addElement (double arr [], double element)
    {
        double result [] = new double[arr.length+1];
        int i = 0;

        for(double each : arr)
        {
            result[i] = each;
            i++;
        }

        result[i] = element;
        return  result;


    }

    public static String[] addElement (String arr[],String element)
    {
        String result [] = new String[arr.length+1];
        int i = 0;

        for(String each : arr)
        {
            result[i] = each;
            i++;
        }

        result[i] = element;
        return result;

    }

    public static char[] addElement(char arr[],char element)
    {
        char result [] = new char[arr.length+1];
        int i=0;

        for (char each : arr)
        {
            result [i] = each;
            i++;
        }

        result[i] = element;
        return result;
    }
}
