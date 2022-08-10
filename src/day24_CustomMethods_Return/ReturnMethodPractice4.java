package day24_CustomMethods_Return;

import java.util.Scanner;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String str = removeDuplicates("aaaabbddasd");
        System.out.println(str);

        System.out.println(" --------------------------------- ");

        int number[] = {1, 2, 3, 100, 5, 80};
        String str2 = IsmaxNumber(number);
        System.out.println( str2);

        System.out.println(" ---------------------------------------");

        String str3 = IsMininumNumber(number);
        System.out.println(str3);




    }

    //create the method than can remove duplicated chars from the strings
    public static String removeDuplicates(String str) // aaabbbccccd ==> abcd
    {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;
            }
        }

        return result;


    }

    public static String IsmaxNumber(int arr [])
    {
        String result = "";
        int maxNumber = arr[0];
        for (int i=0; i<arr.length;i++)
        {
            if(arr [i]> maxNumber)
            {
                maxNumber = arr[i];
            }
        }

        result = maxNumber+ " is maxiumum";
        return  result;
    }

    public static String IsMininumNumber (int arr[])
    {
        String result = "";
        int minimumNumber = arr[0];

        for (int i=0; i< arr.length;i++)
        {
            if(minimumNumber<arr[i])
            {
                arr[i] = minimumNumber;
            }
        }

        result = minimumNumber +" is minimum number";
        return  result;
    }
}

