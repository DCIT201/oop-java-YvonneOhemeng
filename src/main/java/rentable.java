package src.main.java;

/**
 * Interface representing rentable items.
 * Demonstrates the use of polymorphism.
 */
public interface rentable {
    void rent(customer customer, int days);
    void returnVehicle();
}