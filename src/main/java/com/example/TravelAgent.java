package com.example;

public class TravelAgent
{
    private Vehicle vehicle;
    public TravelAgent(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void startJourney()
    {
        this.vehicle.move();
    }
}
