public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " truck diesel engine starts with a heavy rumble.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " truck engine shuts down with a hiss.");
    }

    public double calculateEfficiency() {
        return capacity / numAxles;
    }

    // Геттеры для доступа к приватным полям
    public double getCapacity() {
        return capacity;
    }

    public int getNumAxles() {
        return numAxles;
    }
}