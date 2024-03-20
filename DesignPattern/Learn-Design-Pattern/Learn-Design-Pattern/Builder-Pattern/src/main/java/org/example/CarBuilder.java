package org.example;

public class CarBuilder implements ICarBuilder {
    private String name;
    private CarWheel wheel;
    private Engine engine;
    private String paint;

    @Override
    public CarBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CarBuilder engine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder wheel(CarWheel carWheel) {
        this.wheel = carWheel;
        return this;
    }

    @Override
    public CarBuilder paint(String paint) {
        this.paint = paint;
        return this;
    }

    @Override
    public Car Build() {
        return new Car(name,wheel,engine,paint);
    }
}
