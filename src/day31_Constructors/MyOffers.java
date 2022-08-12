package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {


        Offer offer1 = new Offer();
        offer1.setInfo("VA","SDET","Amazon",110000,true,true,
                true,true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA","QA","SONY",120000,true,false,
                false,true);

        Offer offer3 = new Offer();
        offer3.setInfo("TX","SM","CapitalOne",115000,false,false,
                true,false);

        Offer offer4 = new Offer();
        offer4.setInfo("FL","QE","Apple",125000,true,true,
                true,false);

        Offer offer5 = new Offer();
        offer5.setInfo("WA","BA","Bank Of America",150000,true,true,
                false,true);

        Offer offers [] = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));
        fullTimeOffers.removeIf(p -> p.isFullTime ==false);

        System.out.println("Full time offers: "+fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offers));
        localOffers.removeIf(p -> !p.location.equals("VA"));
        System.out.println("loacal offers: "+localOffers.size());

        for(Offer each : offers)
        {
            System.out.println(each.CompanyName+": "+each.salary+"$");
        }





    }
}
