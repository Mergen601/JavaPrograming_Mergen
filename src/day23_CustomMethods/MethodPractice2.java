package day23_CustomMethods;

public class MethodPractice2
{
    public static void main(String[] args) {

        helloWorld();
        System.out.println("-------------");
        cydeo5Times();
        evenNumber();

    }

    public static  void helloWorld () {
        for (int i=0; i<5; i++)
        {
            System.out.println("Hello World1!");
        }
    } //helloWorld five times
    public static  void cydeo5Times() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Hello Cydeo!");

        }
    } //helloCydeo five times

    public  static  void evenNumber(){
        for (int i = 0; i <=10; i+=2 ){

            System.out.println(i);


        }
    }

}
