package day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        char chars[] = {'A','A','A','B','B','B','C','C','D','D','D'};

        for (int i = 0; i < chars.length; i++) {


            char ch = chars[i];
            int frequency = 0;

            for (int j = 0; j < chars.length; j++)

            {
                if(chars[j] == ch)
                {
                    frequency++;
                }

            }

            if(frequency==2)
            {
                System.out.println("frequency = " + frequency);
            }

        }







    }






}
