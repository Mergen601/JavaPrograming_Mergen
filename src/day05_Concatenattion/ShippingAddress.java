package day05_Concatenattion;

public class ShippingAddress
{
    public static void main(String[] args)
    {
        String name = "İhsan Enver",
                streetName = "Jones Branch DR",
                city = "Mclean",
                state = "VA",
                zipcode = "2220389A";

        String address="\n" +name + "\n" +streetName+ "\n" +city+ "\n" +state+ "\n" +zipcode;
        System.out.println("address  " + address);

    }
}
