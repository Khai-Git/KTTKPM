package org.example;

public interface ICarBuilder {
    CarBuilder name(String name);

    CarBuilder engine(Engine engine);

    CarBuilder wheel(CarWheel carWheel);

    CarBuilder paint(String paint);

    Car Build();
}
