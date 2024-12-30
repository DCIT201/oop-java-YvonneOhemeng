package src.main.java;

/**
 * Class representing a customer.
 * Demonstrates encapsulation.
 */
public class customer {
    private String customerId;
    private String name;
    private String email;
    private String returnDate;
    private String rentalDate;
    private double totalCost;


    // Constructor
    public customer(String customerId, String name, String email,String returnDate,String rentalDate,double totalCost) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.returnDate = returnDate;
        this.rentalDate = rentalDate;
        this.totalCost = totalCost;
    }

    // Getters and setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getreturnDate(){
        return returnDate;
        
    }
    public void getreturnDate(String returnDate){
        this.returnDate = returnDate;

    }
    public String getrentalDate(){
        return returnDate;
        
    }
    public void getrentalDate(String rentalDate){
        this.rentalDate = rentalDate;

    }

    
    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
