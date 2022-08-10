package day20_Arrays;

public class MinNumberOfArrays
{
    public static void main(String[] args) {

        int number [] = {0,10,20,40,100};
        int min = number[0];

        for (int i = number.length - 1; i >= 0; i--) {

            if(number[i]<min)
            {
                number[i] =min;
            }

        }

        System.out.println(min);



    }

}
