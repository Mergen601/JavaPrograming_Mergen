package day14_String;

public class StringMethod2
{
    public static void main(String[] args)
    {
        String str = "Java is fun, I love learning  Java";
        String str2= str.replace("Java","Python");
        System.out.println("str2 = " + str2);
        System.out.println("str = " + str);

        String email = "ihsanenver601@gmail.com";
        System.out.println("email = " + email);
        String newMail = email.replace("gmail","yahoo");
        System.out.println("newMail = " + newMail);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String newSentence = sentence.replace("Python","");
               newSentence = newSentence.replace("  ","");
        System.out.println("sentence = " + sentence);
        System.out.println("newSentence = " + newSentence);

        String s = "Dog Dog Dog Dog Dog";
        String s2 =  s.replace("Dog","Cat");

        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);

        System.out.println("-------------------------");
        String s1 = "C# is fun, C# is cool";
        s1 = s1.replace(" C#"," Java");
        System.out.println("s1 = " + s1);

        String s4 = "Java";
        s4 = s4.replace("a","e");
        System.out.println("s4 = " + s4);
        System.out.println("------------------------");
        String s5 = "Java Java Java Java Java";
        s5 = s5.replaceFirst(" Java"," C");
        System.out.println("s5 = " + s5);

        String result = "C# is fun, C# is cool";
        result= result.replaceFirst("ol","ok");
        System.out.println(result);





    }
}
