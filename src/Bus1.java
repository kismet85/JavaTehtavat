public class Bus1 implements Vehicle{
    private String vehicleType = "";
    private String fuelType = "";
    private int capacity = 0;

    public Bus1(String fuelType, String type , int capacity) {
        this.vehicleType = type;
        this.fuelType = fuelType;
        this.capacity = capacity;
    }
    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus Information:");
        System.out.println("Type: " + vehicleType);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Capacity: " + capacity);
    }
}
