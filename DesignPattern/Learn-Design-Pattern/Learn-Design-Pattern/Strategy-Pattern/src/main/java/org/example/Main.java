package org.example;

import org.example.fly.FlyWithWing;
import org.example.quack.Quacking;

public class Main {
    public static void main(String[] args) {

        Duck duck = new SkyDuck();
        duck.setFlyBehavior(new FlyWithWing());
        duck.setQuackBehavior(new Quacking());
        duck.display();

    }
}