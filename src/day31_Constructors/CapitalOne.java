package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setInfo("Ihsan Enver",18050,2000);
        bankAccount1.deposits(100);
        bankAccount1.checkBalance();
        bankAccount1.withdraw(1000);
        bankAccount1.checkBalance();
        bankAccount1.deposits(100000);
        bankAccount1.checkBalance();



    }
}
