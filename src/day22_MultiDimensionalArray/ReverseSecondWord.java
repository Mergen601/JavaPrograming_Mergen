package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord
{
    public static void main(String[] args) {

        String sentence  = "I love Java";
        String word  [] = sentence.split(" ");
        String reverse= "";


        for (int i = word [1].length()-1; i>=0;i--)
        {
            reverse +=word[1].charAt(i);
        }

        sentence = sentence.replaceFirst(word[1],reverse);
        System.out.println("sentence = " + sentence);








        /* 2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";
                 output:
				I evoL Java  */

    }
}
