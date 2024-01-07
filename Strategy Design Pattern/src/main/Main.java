package main;

import main.model.PassengerVehicle;
import main.model.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle= new PassengerVehicle();
        vehicle.drive();
    }
}