package day17_While_DoWhile;
import java.lang.String;

public class FrequencyOfWord_WhileLoop
{
    public static void main(String[] args) {

        String str = "Java Java Python python java";
        int frequency = 0;
        str = str.toLowerCase();

        while(str.contains("java"))
        {
            str = str.replaceFirst("java","");
            frequency++;
        }
        System.out.println(frequency);

        System.out.println("------------------------------------------");


        String sentence  = "cat cat cat dog cat cat dog cat";
        sentence = sentence.toLowerCase();
        int countCat = 0;

        while(sentence.contains("cat"))
        {
            sentence = sentence.replaceFirst("cat","");
            countCat++;
        }
        System.out.println(countCat);
    }
}
