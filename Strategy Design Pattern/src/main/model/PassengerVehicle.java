package main.model;

import main.Strategy.SpecialDriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new SpecialDriveStrategy());
    }
}
