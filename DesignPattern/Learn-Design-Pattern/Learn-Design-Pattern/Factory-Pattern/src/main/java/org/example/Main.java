package org.example;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory;
        factory = new Animal2LegFactory();
        Animal animal = factory.createAnimal(1);

        System.out.println(animal.getName());

//        factory = new Animal2LegFactory();
//        System.out.println(factory.createAnimal(1).getName());
    }
}