package com.sneha;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static  void  addVehicle(ArrayList<Vehicle>allVehicles){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Choose Vehicle Type (between Heavy, Normal and Sports): ");
        String vehicleType = scanner2.nextLine();

        FormVehicle formVehicle1 = new FormVehicle(vehicleType);
        Vehicle vehicle = formVehicle1.formVehicle(vehicleType);
        System.out.println(vehicle);

        allVehicles.add(vehicle);
    }
    static void removeVehicles(ArrayList<Vehicle>allVehicles){
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter Vehicle Number: ");
        int modelNumber = scanner3.nextInt();

        allVehicles.remove(modelNumber);
    }
    static void display(ArrayList<Vehicle>allVehicles){
        for (int i=0; i<allVehicles.size(); i++) {
            allVehicles.get(i).display();
        }
    }

    public static void main(String[] args) {
        ArrayList<Vehicle>allVehicles = new ArrayList<Vehicle>();

        Vehicle vehicle1 = new NormalVehicle("L2-121221", "oil", 20, 225);
        Vehicle vehicle2 = new SportsVehicle("L8-122311", true, 210, 150);

        allVehicles.add(vehicle1);
        allVehicles.add(vehicle2);

        System.out.println("What do you wanna do? (Select among add, remove, show)");
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        if (task.equals("add")){
            System.out.println("vehicle count before adding:" + allVehicles.size());
            addVehicle(allVehicles);
            System.out.println("vehicle count after adding:" + allVehicles.size());
        }
        else if (task.equals("remove")){
            if (allVehicles.isEmpty() == true)
                System.out.println("No vehicles to remove! Add some before removing!");
            else{
                System.out.println("vehicle count before removing:" + allVehicles.size());
                removeVehicles(allVehicles);
                System.out.println("vehicle count after removing:" + allVehicles.size());

            }
        }
        else if (task.equals("show")){
            display(allVehicles);
        }
        else
            System.out.println("Oops!!! Invalid Task!");

    }

}
