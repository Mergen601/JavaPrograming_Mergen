package day24_CustomMethods_Return;

public class ReturnMethodPractice3
{

    public static void main(String[] args) {


        String str = "aabbccddf";

        for (int i = 0; i < str.length(); i++) {
            int count = frequency(str,str.charAt(i));

            if(count==1)
            {
                System.out.println(str.charAt(i));
            }
        }



    }
    public static int frequency (String word, char ch)
    {
        int count=0;
         for(char each :word.toCharArray())
         {
             if(each==ch)
             {
                 count++;
             }

         }
        return count;

    }
}
