package org.example;

import org.example.decorator.Bubble;
import org.example.decorator.Cheese;
import org.example.decorator.Pudding;

public class Main {
    public static void main(String[] args) {
        IMilkTea milkTea = new MilkTea();
        System.out.println("cost milk tea = " + milkTea.cost() + "$");

        IMilkTea bubbleMilkTea = new Bubble(milkTea);
        System.out.println("cost milk tea + bubble = " + bubbleMilkTea.cost() + "$");

        IMilkTea pudingBubbleMilkTea = new Pudding(bubbleMilkTea);
        System.out.println("cost milk tea + bubble + pudding = " + pudingBubbleMilkTea.cost() + "$");

        IMilkTea cheeseMilkTea = new Cheese(pudingBubbleMilkTea);
        System.out.println("cost cheese + milk tea = " +cheeseMilkTea.cost()+"$");
    }
}