package org.example;

public class MilkTea implements IMilkTea {
    private double cost;

    public MilkTea() {
        cost = 5d;
    }

    @Override
    public double cost() {
        return cost;
    }

}
