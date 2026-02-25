package com.example;

public class Car implements Vehicle {
    @Override
    public void move() {
        IO.println("Car is moving");
    }
}
