package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    static{
        IO.println("-----LOADING CONFIGURATION-----");
    }
    AppConfig(){
        IO.println("-----This is 0 arg constructor-----");

    }

    @Bean
    public Vehicle bike()
    {
        IO.println("-----BEGIN BIKE-----");
        return new Bike();
    }
    @Bean
    public Vehicle cycle()
    {
        IO.println("-----BEGIN CYCLE-----");
        return new Cycle();
    }
    @Bean
    public Vehicle car()
    {
        IO.println("-----BEGIN CAR-----");
        return new Car();
    }
    @Bean
    public TravelAgent travelAgent()
    {
        return new TravelAgent(bike());
    }
}
