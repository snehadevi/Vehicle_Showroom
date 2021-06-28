package com.sneha;

public class HeavyVehicle implements Vehicle{
    private String modelNumber;
    //private String engineType;
    private float weight;
    private  int enginePower;
    private  int tireSize;

    public HeavyVehicle(String modelNUmber, int weight, int enginePower, int tireSize){
        this.modelNumber = modelNUmber;
        this.weight = weight;
        this.enginePower = enginePower;
        this.tireSize = tireSize;
    }


    @Override
    public void getModelNumber() {
        System.out.println("Model Number is: " + modelNumber);
    }

    @Override
    public void getEngineType() {
        System.out.println("Engine Type is: diesel");
    }

    @Override
    public void getEnginePower() {
        System.out.println("Engine Power is: " + enginePower +"BHP");
    }

    @Override
    public void getTireSize() {
        System.out.println("The Tire size is: " + tireSize + "inches");
    }

    public void  getWeight() {
        System.out.println("The Weight is: " + weight + "pounds");
    }

    @Override
    public void countVisitors() {
        System.out.println("Count of the visitors: 50");
    }

    @Override
    public void display() {
        System.out.println("It is a Heavy Vehicle.");
        getModelNumber();
        getEngineType();
        getEnginePower();
        getTireSize();
        getWeight();
        countVisitors();
    }
}
