package MINIPROJECT;

class RentalRecord {
    private String rentalId;
    private String carId;
    private String customerName;
    private int rentalDays;

    public RentalRecord(String rentalId, String carId, String customerName, int rentalDays) {
        this.rentalId = rentalId;
        this.carId = carId;
        this.customerName = customerName;
        this.rentalDays = rentalDays;
    }

    public String getRentalId() {
        return rentalId;
    }

    public String getCarId() {
        return carId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    // Display rental record
    public void displayRentalDetails() {
        System.out.println("Rental ID: " + rentalId + ", Car ID: " + carId + ", Customer: " + customerName + ", Days: " + rentalDays);
    }
}