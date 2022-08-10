package day14_String;

public class StringMethod3_Substring

{
    public static void main(String[] args)
    {
        String str = "Hello Cydeo";
        String str2 = str.substring(0,5);
        System.out.println("str2 = " + str2);
        str2 = str.substring(6);
        System.out.println("str2 = " + str2);

        String word2 = "PYTHON Programing Language";
        String s1;
        String s2;
        String s3;
        s1 = word2.substring(0,(word2.indexOf(" ")));
        System.out.println("s1 = " + s1);

        s2= word2.substring(word2.indexOf(" "),word2.lastIndexOf(" ")+1);
        System.out.println("s2 =" + s2);

        s3=word2.substring(word2.lastIndexOf(" ") );
        System.out.println("s3 =" + s3);
        s1.indexOf(2);









    }
}
