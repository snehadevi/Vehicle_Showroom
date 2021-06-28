package com.sneha;

public class NormalVehicle implements Vehicle{
    private String modelNUmber;
    private String engineType;
    private int enginePower;
    private int tireSize;

    public NormalVehicle(String modelNumber, String engineType, int enginePower, int size) {
        this.modelNUmber = modelNumber;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.tireSize = size;
    }

    @Override
    public void getModelNumber() {
        System.out.println("Model Number is: " + modelNUmber);
    }

    @Override
    public void getEngineType() {
        System.out.println("Engine Type is:" + engineType);
    }

    @Override
    public void getEnginePower() {
        System.out.println("Engine Power is: " + enginePower +"BHP");
    }

    @Override
    public void getTireSize() {
        System.out.println("The Tire size is: " + tireSize + "inches");
    }

    @Override
    public void countVisitors() {
        System.out.println("Count of the visitors: 50");
    }

    @Override
    public void display() {
        System.out.println("It is a Normal Vehicle.");
        getModelNumber();
        getEngineType();
        getEnginePower();
        getTireSize();
        countVisitors();
    }


}
