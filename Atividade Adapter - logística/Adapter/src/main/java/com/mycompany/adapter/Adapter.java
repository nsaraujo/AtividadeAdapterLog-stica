/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.adapter;

/**
 *
 * @author 55649
 */
public class Adapter {

    public static void main(String[] args) {

        // Criando uma instância da biblioteca legada
        OldVehicleStorage oldVehicleStorage = new OldVehicleStorage();

        // Criando uma instância do adaptador
        VehicleStorageAdapter adapter = new VehicleStorageAdapter(oldVehicleStorage);

        // Criando uma instância do gerenciador de veículos
        VehicleManager manager = new VehicleManager(adapter);

        // Criando e adicionando veículos
        Vehicle vehicle1 = new Vehicle("1234", "Truck", 2020);
        Vehicle vehicle2 = new Vehicle("5678", "Car", 2021);

        manager.addVehicle(vehicle1);
        manager.addVehicle(vehicle2);

    }
}





