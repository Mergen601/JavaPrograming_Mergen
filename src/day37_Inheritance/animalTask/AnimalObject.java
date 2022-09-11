package day37_Inheritance.animalTask;

public class AnimalObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex","Husky",18,'F',"Small", "Green");
        System.out.println(dog1);


        Parrot parrot1 =   new Parrot("Donny","Null",15,'M',"Big","Red","Blue");
        System.out.println(parrot1);

        Cat cat1 = new Cat("Love","British",18,'F',"Small","Yellow");
        System.out.println(cat1);
        cat1.drink();


    }
}
