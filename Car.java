package MINIPROJECT;

class Car {
    private String id;
    private String brand;
    private String model;
    private double rentPerDay;

    public Car(String id, String brand, String model, double rentPerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public void displayCarDetails() {
        System.out.println("Car ID: " + id + ", Brand: " + brand + ", Model: " + model + ", Rent/Day: " + rentPerDay);
    }
}
