package day21_ArrayUtility;

public class MaxNum {

    public static void main(String[] args) {

    int [] number = {100,200,40,50,90,150};
    int max = number [0];

    for(int numbers : number)
    {
        if(numbers>max)
        {
           max =numbers;
        }
    }
        System.out.println(max);







    }

}
