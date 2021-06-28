package com.sneha;

import java.util.Scanner;

public class FormVehicle {
    private  String vehicleType;
    private  Vehicle vehicle;
    Scanner scanner2 = new Scanner(System.in);

    public FormVehicle(String vehicleType){
        this.vehicleType = vehicleType;
    }
    public Vehicle formVehicle(String vehicleType){

        // String modelNUmber, int weight, int enginePower, int tireSize
        if (vehicleType.equals("Heavy")){
            System.out.println("Enter Model Number: ");
            String modelNumber = scanner2.nextLine();
            System.out.println("Enter Vehicle WEight: ");
            int modelWeight = scanner2.nextInt();
            System.out.println("Enter Engine Power: ");
            int enginePower = scanner2.nextInt();
            System.out.println("Enter TireSize: ");
            int size = scanner2.nextInt();
            vehicle = new HeavyVehicle(modelNumber, modelWeight, enginePower, size);

        } else if (vehicleType.equals("Normal")){
            System.out.println("Enter Model Number: ");
            String modelNumber = scanner2.nextLine();
            System.out.println("Enter Engine Type: ");
            String engineType = scanner2.nextLine();
            System.out.println("Enter Engine Power: ");
            int enginePower = scanner2.nextInt();
            System.out.println("Enter TireSize: ");
            int size = scanner2.nextInt();
            vehicle = new NormalVehicle(modelNumber, engineType, enginePower, size);

        }else if(vehicleType.equals("Sports")){
            System.out.println("Enter Model Number: ");
            String modelNumber = scanner2.nextLine();
            System.out.println("Enter Vehicle Turbo: ");
            boolean turbo = scanner2.nextBoolean();
            System.out.println("Enter Engine Power: ");
            int enginePower = scanner2.nextInt();
            System.out.println("Enter TireSize: ");
            int size = scanner2.nextInt();
            vehicle = new SportsVehicle(modelNumber, turbo, enginePower, size);
        }
        return vehicle;
    }
}
