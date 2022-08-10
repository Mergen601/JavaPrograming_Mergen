package Test;

import Utilities.ArrayUtilities;

public class Test2
{
    public static void main(String[] args) {

        int arr [] = {10,20,30,40};
        ArrayUtilities.printEach(arr);
        int maxNumber  = ArrayUtilities.maxNumber(arr);
        System.out.println("maxNumber = " + maxNumber);


        System.out.println("----------------");

        double arr1[] = {10.5,22.3,5.0,11.1};
        ArrayUtilities.printEach(arr1);


        System.out.println("-----------------");

        char arr2 [] = {'a','b','c','d','E'};
        ArrayUtilities.printEach(arr2);

        System.out.println("-----------------");

        String str [] = {"Ahmet","Mehmet","Beyza","İhsan"};
        ArrayUtilities.printEach(str);

        String str2 [] ;

    }
}
