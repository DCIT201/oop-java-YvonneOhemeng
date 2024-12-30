package src.main.java;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Create customers
        customer customer1 = new customer("C1", "Yvonne Ohemeng", "ohemeng@gmail.com", "2024-01-05", "2023-12-30", 0);
        customer customer2 = new customer("C2", "Adwoa Mensah", "mensah@gmail.com", "2024-01-07", "2023-12-28", 0);

        // Create vehicles
        vehicle car1 = new car("1", "Toyota Camry", 50, true, true);
        vehicle car2 = new car("2", "Honda Civic", 40, true, false);
        vehicle motorCycle1 = new motorCycle("3", "Yamaha R1", 30, true, true);
        vehicle truck1 = new truck("4", "Ford F-150", 60, true, 1000);

        // Create rental agency
        rentalAgency agency = new rentalAgency();
        agency.addVehicle(car1);
        agency.addVehicle(car2);
        agency.addVehicle(motorCycle1);
        agency.addVehicle(truck1);

        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Vehicle Rental Agency!");
            System.out.println("1. Rent a vehicle");
            System.out.println("2. Return a vehicle");
            System.out.println("3. Exit");
            System.out.print("Please choose an option (1, 2, or 3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Rent a vehicle
                    System.out.println("\nAvailable vehicles for rent:");
                    for (vehicle v : agency.getVehicles()) {
                        if (v.isAvailableForRental()) {
                            System.out.println(v.getVehicleId() + ". " + v.getModel() + " - $" + v.getBaseRentalRate() + " per day");
                        }
                    }

                    System.out.print("\nEnter the vehicle ID you want to rent: ");
                    String vehicleId = scanner.nextLine();

                    System.out.print("Enter the number of days you want to rent: ");
                    int days = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter customer ID (C1 for John, C2 for Jane): ");
                    String customerId = scanner.nextLine();
                    customer rentingCustomer = customer1.getCustomerId().equals(customerId) ? customer1 : customer2;

                    agency.rentVehicle(vehicleId, rentingCustomer, days);
                    break;

                case 2:
                    // Return a vehicle
                    System.out.print("\nEnter the vehicle ID to return: ");
                    String returnVehicleId = scanner.nextLine();

                    agency.returnVehicle(returnVehicleId);
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Thank you for using the Vehicle Rental Agency!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
