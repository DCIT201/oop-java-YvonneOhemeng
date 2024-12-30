package src.main.java;
/**
 * Class representing a motorcycle.
 * Extends the Vehicle class and implements the Rentable interface.
 */
public class motorCycle extends vehicle implements rentable {
    private boolean hasHelmet;

    // Constructor
    public motorCycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean hasHelmet) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.hasHelmet = hasHelmet;
    }

    // Getters and settersv 


    public boolean hasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    // Implementation of abstract methods
    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasHelmet) {
            cost += 2 * days; // Additional charge for helmet
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
            System.out.println("Motorcycle rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Motorcycle is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle returned.");
    }
}
