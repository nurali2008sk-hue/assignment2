enum FuelType {
    PETROL, DIESEL, ELECTRIC, HYBRID
}

public class Car extends Vehicle {
    private int doors;
    private FuelType fuelType;

    public Car(String brand, int year, int doors, FuelType fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " car with " + fuelType + " engine starts quietly.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " car engine shuts down with a soft click.");
    }

    public void displayCarDetails() {
        displayInfo();
        System.out.println("Doors: " + doors + " | Fuel: " + fuelType);
    }
}