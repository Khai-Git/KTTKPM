package org.example.decorator;

import org.example.IMilkTea;

public class Bubble extends MilkTeaDecorator {

    public Bubble(IMilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public double cost() {
        return super.cost() + 1d;
    }
}
