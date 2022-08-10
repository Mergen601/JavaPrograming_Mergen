package day21_ArrayUtility;

public class StringMethod {

    public static void main(String[] args) {


        String prg = "Python";
        for (char alphabet: prg.toCharArray())
        {
            System.out.print(alphabet+" ");
        }



        System.out.println("\n---------------------------------");

        String str = "Java";
        for(char each : str.toCharArray())
        {
            int count = 0;

            for (char unique : str.toCharArray())
            {
                if(each==unique)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(each);
            }
        }

    }
}
