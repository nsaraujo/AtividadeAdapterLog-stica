/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 55649
 */
public class VehicleManager {
    
    private List<Vehicle> vehicles = new ArrayList<>();
    private IVehicleStorage vehicleStorage;

    public VehicleManager(IVehicleStorage vehicleStorage) {
        this.vehicleStorage = vehicleStorage;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        vehicleStorage.saveVehicleData(vehicle);
    }

    public void printAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("ID: " + vehicle.getId() + ", Model: " + vehicle.getModel() + ", Year: " + vehicle.getYear());
        }
    }
}


