package src.main.java;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Class representing the rental agency.
 * Manages vehicles and transactions.
 */
public class rentalAgency {
    private List<vehicle> vehicles;
    private List<rentalTransaction> transactions;

    // Constructor
    public rentalAgency() {
        vehicles = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Methods to add and retrieve vehicles
    public void addVehicle(vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<vehicle> getVehicles() {
        return vehicles;
    }

    // Method to rent a vehicle
    public void rentVehicle(String vehicleId, customer customer, int days) {
        for (vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.rent(customer, days);
                double cost = vehicle.calculateRentalCost(days);
                rentalTransaction transaction = new rentalTransaction(
                        "TXN" + (transactions.size() + 1), 
                        customer, 
                        vehicle, 
                        new Date(), 
                        null, 
                        cost
                );
                transactions.add(transaction);
                System.out.println("Transaction ID: " + transaction.getTransactionId() + ", Total Cost: " + cost);
                return;
            }
        }
        System.out.println("Vehicle not available for rental.");
    }

    // Method to return a vehicle
    public void returnVehicle(String vehicleId) {
        for (rentalTransaction transaction : transactions) {
            if (transaction.getVehicle().getVehicleId().equals(vehicleId) && transaction.getReturnDate() == null) {
                transaction.getVehicle().returnVehicle();
                transaction.setreturnDate(new returnDate());
                System.out.println("Vehicle returned. Transaction ID: " + transaction.getTransactionId());
                return;
            }
        }
        System.out.println("No active rental found for vehicle ID: " + vehicleId);
    }
}