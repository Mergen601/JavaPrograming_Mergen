package day16_ForLoopStringPractice;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        String str ="aaabbbaacc";
        String result = "";

        for (int i=0; i<str.length(); i++)
        {
            //i: i represent  all the index numbers starting of str(start from zero)
            String ch = ""+str.charAt(i);
            if(!result.contains(ch)) {
                result += ch;
            }

        }

        System.out.println(result);
    }
}
