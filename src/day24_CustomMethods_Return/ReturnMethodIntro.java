package day24_CustomMethods_Return;

public class ReturnMethodIntro
{
    public static void main(String[] args) {

        String str = "Java";
        String result = Reverse("avaj");
        System.out.println(result);

        if(str.equalsIgnoreCase(result))
        {
            System.out.println(str+" is palindrom");
        }
        else
        {
            System.out.println(str+" is not palindrom");
        }

    }

    public static String Reverse(String word )
    {
        String reverse = "";
        for(int i=word.length()-1; i>=0;i--)
        {
           reverse += word.charAt(i);
        }
        return reverse ;

    }
}
