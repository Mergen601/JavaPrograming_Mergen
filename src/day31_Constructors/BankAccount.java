package day31_Constructors;

public class BankAccount {

        public String accountHolder;
        public long accountNumber;
        public double balance;

        public void  setInfo(String accountHolder, long accountNumber, double balance)
        {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void  checkBalance()
        {
            System.out.println("Your availabkle balance is "+balance+"$" );
        }

        public void  deposits(double amount){
        if (amount<=0)
        {
            System.err.println("Depositing amount can not be zero or negative");
            return;
        }

        balance += amount;

    }

        public void  withdraw(double amount){

        if (balance<amount)
        {
            System.out.println("Insufficient Balance");
            return;
        }
        if(amount<=0)
        {
            System.out.println("withdrawing amount can not be zero or negative");
        }
        balance -= amount;
    }

        public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
