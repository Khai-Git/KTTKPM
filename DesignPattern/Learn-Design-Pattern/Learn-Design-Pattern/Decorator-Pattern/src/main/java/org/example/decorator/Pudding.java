package org.example.decorator;

import org.example.IMilkTea;

public class Pudding extends MilkTeaDecorator {
    public Pudding(IMilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public double cost() {
        return super.cost() + 3d;
    }
}
