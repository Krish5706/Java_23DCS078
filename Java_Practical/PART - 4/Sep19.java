abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    abstract double calculateFuelEfficiency(); // in km per liter
    abstract double calculateDistanceTraveled(double fuel); // in km
    abstract double getMaxSpeed(); // in km per hour

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }
}

// Define the Truck subclass
class Truck extends Vehicle {
    private double payloadCapacity;

    // Constructor
    public Truck(String make, String model, int year, String fuelType, double payloadCapacity) {
        super(make, model, year, fuelType);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    double calculateFuelEfficiency() {
        // Example calculation for fuel efficiency
        return 6.0; // Assume 6 km per liter
    }

    @Override
    double calculateDistanceTraveled(double fuel) {
        return calculateFuelEfficiency() * fuel;
    }

    @Override
    double getMaxSpeed() {
        // Example maximum speed
        return 120.0; // 120 km per hour
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }
}

// Define the Car subclass
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
        super(make, model, year, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    double calculateFuelEfficiency() {
        // Example calculation for fuel efficiency
        return 15.0; // Assume 15 km per liter
    }

    @Override
    double calculateDistanceTraveled(double fuel) {
        return calculateFuelEfficiency() * fuel;
    }

    @Override
    double getMaxSpeed() {
        // Example maximum speed
        return 200.0; // 200 km per hour
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}

// Define the Motorcycle subclass
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    double calculateFuelEfficiency() {
        // Example calculation for fuel efficiency
        return 25.0; // Assume 25 km per liter
    }

    @Override
    double calculateDistanceTraveled(double fuel) {
        return calculateFuelEfficiency() * fuel;
    }

    @Override
    double getMaxSpeed() {
        return 180.0; // 180 km per hour
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}

public class Sep19 {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "FH16", 2022, "Diesel", 30000);
        Car car = new Car("Toyota", "Corolla", 2021, "Petrol", 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2020, "Petrol", false);

        // Test Truck
        System.out.println("Truck:");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Fuel Type: " + truck.getFuelType());
        System.out.println("Payload Capacity: " + truck.getPayloadCapacity() + " kg");
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled with 50 liters: " + truck.calculateDistanceTraveled(50) + " km");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");
        System.out.println();

        // Test Car
        System.out.println("Car:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Fuel Type: " + car.getFuelType());
        System.out.println("Number of Doors: " + car.getNumberOfDoors());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled with 50 liters: " + car.calculateDistanceTraveled(50) + " km");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");
        System.out.println();

        // Test Motorcycle
        System.out.println("Motorcycle:");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Fuel Type: " + motorcycle.getFuelType());
        System.out.println("Has Sidecar: " + motorcycle.hasSidecar());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled with 50 liters: " + motorcycle.calculateDistanceTraveled(50) + " km");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " km/h");
    }
}
