package org.example.quack;

public class Quacking implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack");
    }
}
