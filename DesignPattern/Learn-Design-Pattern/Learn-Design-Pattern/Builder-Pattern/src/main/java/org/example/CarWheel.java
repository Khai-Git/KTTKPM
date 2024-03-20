package org.example;

public class CarWheel {
    private String name ;

    public CarWheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarWheel{" +
                "name='" + name + '\'' +
                '}';
    }
}
