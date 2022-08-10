package day22_MultiDimensionalArray;

public class ForEachLoop
{
    public static void main(String[] args)
    {

        int arr2d [] [] = {{1,2,3},{4,5,6,7},{8,9,10,11,12,13}};

        for (int each1dArray [] :arr2d)
        {
            for (int element : each1dArray)
            {
                System.out.print(element+" ");
            }

            System.out.println();

        }

    }
}
