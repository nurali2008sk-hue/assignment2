import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4, FuelType.HYBRID);
        Motorcycle bike = new Motorcycle("Harley", 2020, false);
        Truck truck = new Truck("Volvo", 2023, 15.5, 4);

        Driver driver1 = new Driver("Alex", "DL-8890");
        Driver driver2 = new Driver("Sam", "DL-7732");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        System.out.println("=== Vehicle Management System ===\n");

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();

            if (v instanceof Car) {
                ((Car) v).displayCarDetails();
            } else if (v instanceof Truck) {
                Truck t = (Truck) v;
                System.out.printf("Capacity: %.1f tons | Axles: %d%n",
                        t.getCapacity(),
                        t.getNumAxles());
            }

            v.stopEngine();

            if (v instanceof Car || v instanceof Truck) {
                driver1.displayDriverInfo();
            } else {
                driver2.displayDriverInfo();
            }
            System.out.println();
        }
    }
}