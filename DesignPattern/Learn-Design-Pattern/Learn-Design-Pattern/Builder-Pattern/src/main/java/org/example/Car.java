package org.example;

public class Car {
    private String name;
    private CarWheel wheel;
    private Engine engine;
    private String paint;

    public Car(String name, CarWheel wheel, Engine engine, String paint) {
        this.name = name;
        this.wheel = wheel;
        this.engine = engine;
        this.paint = paint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarWheel getWheel() {
        return wheel;
    }

    public void setWheel(CarWheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", wheel=" + wheel +
                ", engine=" + engine +
                ", paint='" + paint + '\'' +
                '}';
    }
}
