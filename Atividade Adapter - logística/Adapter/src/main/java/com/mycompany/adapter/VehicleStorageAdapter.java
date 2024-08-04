/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author 55649
 */

public class VehicleStorageAdapter implements IVehicleStorage {
    private OldVehicleStorage oldVehicleStorage;

    public VehicleStorageAdapter(OldVehicleStorage oldVehicleStorage) {
        this.oldVehicleStorage = oldVehicleStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        String data = "ID: " + vehicle.getId() + ", Model: " + vehicle.getModel() + ", Year: " + vehicle.getYear();
        oldVehicleStorage.storeVehicleData(data);
    }
    
    
}

