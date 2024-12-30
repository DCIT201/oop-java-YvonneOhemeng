package src.main.java;

/**
 * Main class to run the rental agency application.
 * Demonstrates the use of the classes and OOP principles.
 */
public class main {
    public static void Main (String[] args) {
        // Create rental agency
        rentalAgency agency = new rentalAgency();

        // Create some vehicles
      
        motorCycle moto1 = new motorCycle("MOTO456", "Harley Davidson", 30.0, true, true);
        truck truck1 = new truck("TRUCK789", "Ford F-150", 80.0, true, 1000.0);

        // Add vehicles to agency
      
        agency.addVehicle(moto1);
        agency.addVehicle(truck1);

        // Create a customer
      //  customer customer1 = new customer("CUST001", "Yvonne Ohemeng", "ohemeng@gmail.com");

        // Rent a vehicle
       // agency.rentVehicle("CAR123", customer1, 7); // Rent car1 to customer1 for days
       // agency.rentVehicle("MOTO456", customer1, 2); // Rent moto1 to customer1 for 2 days

        // Return a vehicle
        agency.returnVehicle("CAR123"); // Return car1
    }
}
