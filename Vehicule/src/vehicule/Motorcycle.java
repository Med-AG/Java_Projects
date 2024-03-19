/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule;

// Motorcycle.java
// Child class Motorcycle

public class Motorcycle extends Vehicule {
    private double engineDisplacement;

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType, fuelEfficiency);
      //  this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public double calculateFuelEfficiency() {
        // implementation for fuel efficiency calculation for motorcycles
        return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
    }

      @Override
    public double calculateDistanceTraveled() {
        // implementation for distance traveled calculation for cars
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        // implementation for maximum speed calculation for cars
        return 80.0;
    }
} 
