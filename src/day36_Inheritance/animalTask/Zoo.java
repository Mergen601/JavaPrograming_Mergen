package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Jack","Husky",18,'F',"Small","Blue");
        dog1.barking();
        dog1.eat();
        dog1.move();
        dog1.drink();

        Cat cat1 = new Cat();
        cat1.setInfo("lili","British",15,'M',"Big","Black");
        cat1.ismiawing();
        cat1.Scratching();
        cat1.eat();
        cat1.drink();
        cat1.move();

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Sher Khan","Bengal",10,'M',"Big","Orange");
        tiger1.hunt();
        tiger1.roar();
    }
}
