package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 1000;
        double lira = dollar * 15;
        double euro = dollar * 1.16;
        double jpy =  dollar* 114.14;
        double pound = dollar*0.73;
        double cad =  dollar*1.24;

        System.out.println("euro = " + euro);
        System.out.println("lira = " + lira);
        System.out.println("cad = " + cad);
        System.out.println("pound = " + pound);
        System.out.println("jpy = " + jpy);

    }
}
