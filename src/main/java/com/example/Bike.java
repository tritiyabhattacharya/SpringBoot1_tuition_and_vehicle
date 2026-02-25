package com.example;

public class Bike implements Vehicle {
    @Override
    public void move() {
        IO.println("Bike is moving");
    }
}
