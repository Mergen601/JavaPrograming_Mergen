package day21_ArrayUtility;

public class Initials {

    public static void main(String[] args) {

        String arr[] = {"Beyza Nur", "Tuğba Nur", "ihsan Enver", "Bilgehan Tengiz", "Michal Jackson"};

        for (String each : arr) {
            String result = "" + each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1);
            System.out.println(result);


        }

    }
}
