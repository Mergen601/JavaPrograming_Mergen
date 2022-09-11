package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("11 pro","Big",4500,"Green");

        Samsung samsung = new Samsung("GalaxyA21","Medium",5000,"Blue");

        Nokia nokia = new Nokia("N21","Small",4500,"Black");

        System.out.println(iphone);
        System.out.println(samsung);


        iphone.call(911);
        iphone.text(121231231);
        iphone.faceTime("ihsanenver601@gmail.com");
        iphone.faceTime(445545);


        System.out.println("---------------------------------------------------");
        samsung.freeze();
        samsung.call(95454);
        samsung.text(911);

        System.out.println("-------------------------------------");
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Phone.hasBattery);


    }
}
