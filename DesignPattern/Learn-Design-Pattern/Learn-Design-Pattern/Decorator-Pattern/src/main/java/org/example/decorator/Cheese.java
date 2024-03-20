package org.example.decorator;

import org.example.IMilkTea;

public class Cheese extends MilkTeaDecorator{

    public Cheese(IMilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public double cost() {
        return super.cost() + 4d;
    }
}
