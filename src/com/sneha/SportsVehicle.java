package com.sneha;

public class SportsVehicle implements  Vehicle{
    private String modelNUmber;
    private boolean turbo = false;
    private int enginePower;
    private int tireSize;


    public SportsVehicle(String modelNUmber, boolean turbo, int enginePower, int tireSize){
        this.modelNUmber = modelNUmber;
        this.turbo = turbo;
        this.enginePower = enginePower;
        this.tireSize = tireSize;

    }

    @Override
    public void getModelNumber() {
        System.out.println("Model Number is: " + modelNUmber);
    }

    @Override
    public void getEngineType() {
        System.out.println("Engine Type is: oil");
    }

    @Override
    public void getEnginePower() {
        System.out.println("Engine Power is: " + enginePower +"BHP");
    }

    @Override
    public void getTireSize() {
        System.out.println("The Tire size is: " + tireSize + "inches");
    }

    public void getTurbo(){
        if (turbo == true)
            System.out.println("Engine has Turbo");
        else
            System.out.println("Engine doesn't have Turbo");
    }

    @Override
    public void countVisitors() {
        System.out.println("Count of the visitors: 50");
    }

    @Override
    public void display() {
        System.out.println("It is a Sports Vehicle.");
        getModelNumber();
        getEngineType();
        getEnginePower();
        getTireSize();
        getTurbo();
        countVisitors();
    }
}
