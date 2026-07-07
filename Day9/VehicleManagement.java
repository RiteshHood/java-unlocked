// Parent Class

class Vehicle {

    // Variables
    String brand;
    int speed;

    // Methods
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Child Class
class Car extends Vehicle {

    // Additional Variable
    String fuelType;

    // Additional Method
    void honk() {
        System.out.println("Car says: Beep Beep!");
    }
}

// Grandchild Class
class ElectricCar extends Car {

    // Additional Variable
    int batteryPercentage;

    // Additional Method
    void charge() {
        System.out.println("Electric car is charging...");
    }
}

// Main Class
public class VehicleManagement {

    public static void main(String[] args) {

        // Creating ElectricCar object
        ElectricCar tesla = new ElectricCar();

        // Setting inherited Vehicle properties
        tesla.brand = "Tesla";
        tesla.speed = 180;

        // Setting Car property
        tesla.fuelType = "Electric";

        // Setting ElectricCar property
        tesla.batteryPercentage = 85;

        // Calling inherited Vehicle methods
        tesla.start();

        // Calling Car method
        tesla.honk();

        // Calling ElectricCar method
        tesla.charge();

        // Displaying all properties
        System.out.println("\n===== Vehicle Details =====");

        System.out.println("Brand              : " + tesla.brand);
        System.out.println("Speed              : " + tesla.speed + " km/h");
        System.out.println("Fuel Type          : " + tesla.fuelType);
        System.out.println("Battery Percentage : " + tesla.batteryPercentage + "%");

        // Calling inherited Vehicle method
        tesla.stop();
    }
}
