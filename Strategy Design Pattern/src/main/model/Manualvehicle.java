package main.model;

import main.Strategy.NormalDriveStrategy;

public class Manualvehicle extends Vehicle{
    public Manualvehicle() {
        super(new NormalDriveStrategy());
    }
}
