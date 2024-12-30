package src.main.java;

/**
 * Class representing a car.
 * Extends the Vehicle class and implements the Rentable interface.
 */
public class car extends vehicle implements rentable {
    private boolean hasAirConditioning;

    // Constructor
    public car(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean hasAirConditioning) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.hasAirConditioning = hasAirConditioning;
    }

    // Getters and setters
    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    // Implementation of abstract methods
    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasAirConditioning) {
            cost += 5 * days; // Additional charge for AC
        }
        return cost;
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
            System.out.println("Car rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Car is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car returned.");
    }
}