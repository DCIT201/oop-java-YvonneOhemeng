package src.main.java;
/**
 * Class representing a truck.
 * Extends the Vehicle class and implements the Rentable interface.
 */
public class truck extends vehicle implements rentable {
    private double loadCapacity;

    // Constructor
    public truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable, double loadCapacity) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.loadCapacity = loadCapacity;
    }

    // Getters and setters
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    // Implementation of abstract methods
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (loadCapacity * 10); // Additional charge based on load capacity
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    // Implementation of Rentable interface methods
    @Override
    public void rent(customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println("Truck rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Truck is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Truck returned.");
    }

}