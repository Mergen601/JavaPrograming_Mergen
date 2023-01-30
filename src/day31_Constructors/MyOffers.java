package day31_Constructors;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer = new Offer();
        offer.setInfo("ANKARA","Cydeo","Tester",7000.0,false,false,true,false);
        System.out.println("offer = " + offer);

        offer.location = "İstanbul";
        System.out.println(offer.location);

        Offer offer2 = new Offer();
        offer2.setInfo("America","Cydeo","Testter",5454,false,true,true,true);
        System.out.println("offer2 = " + offer2);
    }
}
