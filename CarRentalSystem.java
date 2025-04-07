package MINIPROJECT;

import java.util.Scanner;
import java.util.ArrayList;

class CarRentalSystem {
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<RentalRecord> rentals = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addCar() {
        System.out.print("Enter Car ID: ");
        String id = scanner.next();
        System.out.print("Enter Brand: ");
        String brand = scanner.next();
        System.out.print("Enter Model: ");
        String model = scanner.next();
        System.out.print("Enter Rent/Day: ");
        double rent = scanner.nextDouble();
        cars.add(new Car(id, brand, model, rent));
        System.out.println("Car added successfully!");
    }

    public void modifyCar() {
        System.out.print("Enter Car ID to modify: ");
        String id = scanner.next();
        for (Car car : cars) {
            if (car.getId().equals(id)) {
                System.out.print("Enter new Rent/Day: ");
                double newRent = scanner.nextDouble();
                car.setRentPerDay(newRent);
                System.out.println("Car details updated successfully!");
                return;
            }
        }
        System.out.println("Car not found!");
    }

    public void removeCar() {
        System.out.print("Enter Car ID to remove: ");
        String id = scanner.next();
        boolean removed = cars.removeIf(car -> car.getId().equals(id));
        if (removed) {
            System.out.println("Car removed successfully!");
        } else {
            System.out.println("Car not found!");
        }
    }

    public void viewAllCars() {
        System.out.println("Car Details:");
        for (Car car : cars) {
            car.displayCarDetails();
        }
    }

    public void addRentalRecord() {
        System.out.print("Enter Rental ID: ");
        String rentalId = scanner.next();
        System.out.print("Enter Car ID: ");
        String carId = scanner.next();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.next();
        System.out.print("Enter Rental Days: ");
        int rentalDays = scanner.nextInt();
        rentals.add(new RentalRecord(rentalId, carId, customerName, rentalDays));
        System.out.println("Rental record added successfully!");
    }

    public void viewAllRentals() {
        System.out.println("Rental Records:");
        for (RentalRecord record : rentals) {
            record.displayRentalDetails();
        }
    }

    public void viewCarDetails() {
        System.out.print("Enter Car ID to view: ");
        String id = scanner.next();
        for (Car car : cars) {
            if (car.getId().equals(id)) {
                car.displayCarDetails();
                return;
            }
        }
        System.out.println("Car not found!");
    }

    public void run() {
        while (true) {
            System.out.println("\nCar Rental System Menu:");
            System.out.println("1. Add Car");
            System.out.println("2. Modify Car Details");
            System.out.println("3. Remove Car");
            System.out.println("4. View All Cars");
            System.out.println("5. Add Rental Record");
            System.out.println("6. View All Rental Records");
            System.out.println("7. View Car Details");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addCar();
                case 2 -> modifyCar();
                case 3 -> removeCar();
                case 4 -> viewAllCars();
                case 5 -> addRentalRecord();
                case 6 -> viewAllRentals();
                case 7 -> viewCarDetails();
                case 8 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
