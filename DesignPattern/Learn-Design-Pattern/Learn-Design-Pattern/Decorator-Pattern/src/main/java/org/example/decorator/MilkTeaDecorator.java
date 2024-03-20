package org.example.decorator;

import org.example.IMilkTea;

public abstract class MilkTeaDecorator implements IMilkTea {

    protected IMilkTea milkTea;

    public MilkTeaDecorator(IMilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public double cost() {
        return milkTea.cost();
    }
}
