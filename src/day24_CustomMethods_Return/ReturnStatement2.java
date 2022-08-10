package day24_CustomMethods_Return;

public class ReturnStatement2

{
    public static void main(String[] args) {
        nameOfMonth(13);

    }
    public static void nameOfMonth(int number) {
        String name = " ";
        if(number<1 || number>12)
        {
            System.out.println("Invalid");
            return;
        }


            name  =  (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "March" :(number==4)? "April" :(number==5)? "May"
                    :(number==6)? "June" :(number==7)? "July" :(number==8)? "August" :(number==9)? "September" :(number==10)? "October"
                    :(number==11)? "November" : "December";


        System.out.println("name = " + name);
    }
}
