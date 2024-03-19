package vehicule;


public class Truck extends Vehicule {
    
    private double cargoCapacity;
    
    public Truck(double cargoCapacity, String make, String model, int year, String fuelType, double fuelEfficiency) 
    {
        super(make, model, year, fuelType, cargoCapacity);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() 
    {
        return cargoCapacity;
    }
    
    
    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency()*(1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 80.0;
    }
    
    
    
    
    
    
    
    
}
