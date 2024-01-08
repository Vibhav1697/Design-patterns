package Adapter;

import Adaptee.WeightMachine;

public class KilogramAdapterImpl implements KilogramAdapter {
    WeightMachine weightMachine;

    public KilogramAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
       double weightInPound = weightMachine.getWeightinPound();
       return weightInPound * 0.45;
    }
}
