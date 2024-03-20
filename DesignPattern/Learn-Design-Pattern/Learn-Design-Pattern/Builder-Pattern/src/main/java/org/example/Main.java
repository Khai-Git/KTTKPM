package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .wheel(new CarWheel("4"))
                .engine(new Engine("eg3"))
                .name("Four")
                .Build();
        System.out.println(car);

    }
}