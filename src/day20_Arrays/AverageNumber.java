package day20_Arrays;

public class AverageNumber
{
    public static void main(String[] args) {

        int number [] = {10,100,40,50,200};
        int sum = 0;

        for (int i = 0; i < number.length; i++) {

            sum += number[i];
        }

        double average = sum/ number.length;

        System.out.println("average = " + average);



    }

}
