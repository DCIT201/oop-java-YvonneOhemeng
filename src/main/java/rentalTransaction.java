package src.main.java;
import java.util.Date;

/**
 * Class representing a rental transaction.
 * Demonstrates association between classes.
 */
public class rentalTransaction {
    private String transactionId;
    private customer customer;
    private vehicle vehicle;
    private Date rentalDate;
    private Date returnDate;
    private double totalCost;

    // Constructor
    public rentalTransaction(String transactionId, customer customer, vehicle vehicle, Date rentalDate, Date returnDate, double totalCost) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.totalCost = totalCost;
    }

    // Getters and setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public customer  getcustomer() {
        return customer;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }

    public vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setrentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void settotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setreturnDate(returnDate returnDate2) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setreturnDate'");
    }

   
}
