package org.example;

public class Animal4LegFactory extends AnimalFactory {
    private FourLeg leg;

    @Override
    public Animal createAnimal(int type) {
        if (type == 1) {
            leg = new Dog();
            return leg;
        }
        if (type == 2) {
            leg = new Cat();
            return leg;
        }
        return null;
    }
    public Animal createDog(){
        return new Dog();
    }

    }
