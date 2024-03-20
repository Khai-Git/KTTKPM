package org.example.quack;

public class NoQuack implements QuackBehavior
{
    @Override
    public void quack() {
        System.out.println("Silent!!");
    }
}
