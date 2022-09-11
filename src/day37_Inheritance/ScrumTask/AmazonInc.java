package day37_Inheritance.ScrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String company = "Amazon Inc";

         ProductOwner PO = new ProductOwner("Suhail",18,'F',1850,4850,company);

         BussinessAnaliyst BA = new BussinessAnaliyst("Enes",22,'M',1851,4550,company);

         ScrumMaster SM = new ScrumMaster("Anel",26,'M',1852,7000,company);



         Tester tester1 = new Tester("ihsan",22,'M',1853,10000,company);

         Tester tester2 = new Tester("Enes",22,'M',1854,11000,company);

         Tester tester3 = new Tester("İsmail",23,'M',1855,10000,company);

         Tester [] testers = {tester1,tester2,tester3};


         Developer developer1 = new Developer("Beyza",18,'F',550,10000,company);

         Developer developer2 = new Developer("Bilgehan", 22,'M',551,10000,company);

         Developer developer3 = new Developer("Sıla",23,'F',552,552000,company);

         Developer [] developers = {developer1,developer2,developer3};

         ScrumTeam scrumTeam = new ScrumTeam(PO,BA,SM);

         scrumTeam.addDeveloper(developer1);
         scrumTeam.addTester(tester1);

        System.out.println(scrumTeam);

        System.out.println("------------------------------");


        for (Tester tester: scrumTeam.testers) {

            System.out.println(tester);

        }








    }
}
