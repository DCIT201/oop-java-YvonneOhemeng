package src.main.java;
/**
 * Abstract base class representing a vehicle.
 * Demonstrates the use of encapsulation and abstraction.
 */
public abstract class vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructor
    public vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    // Getters and setters with encapsulation and validation
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Abstract methods for rental calculation and availability check
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    public void rent(customer customer, int days) {
        
        throw new UnsupportedOperationException("Unimplemented method 'rent'");
    }

    public void returnVehicle() {
        
        throw new UnsupportedOperationException("Unimplemented method 'returnVehicle'");
    }

  
}