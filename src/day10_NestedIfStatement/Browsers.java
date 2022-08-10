package day10_NestedIfStatement;

public class Browsers
{
    public static void main(String[] args) {
        String browserName = "Chrome";
        String result = "";
        boolean validBrowser = browserName == "Chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge";
        if(validBrowser)
        {

             if (browserName == "firefox")
             {
                result = "fire fox is selected";
              }
              else if (browserName == "opera")
              {
                result = "opera is selected";
              }
              else if (browserName == "safari")
              {
                result = "safari is selected";
              }
              else if (browserName == "edge")
              {
                result = "edge is selected";
              }
              else
              {
                result = "Chrome is selected";
              }
            }
        else
        {
            result = "Invalid Number";
        }

        System.out.println(result);


    }
}
