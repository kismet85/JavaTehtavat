public class Car1 implements Vehicle{
    private String vehicleType = "";
    private String fuelType = "";
    private String color = "";

    public Car1(String fuelType, String type , String color) {
        this.vehicleType = type;
        this.fuelType = fuelType;
        this.color = color;
    }
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Car Information:");
        System.out.println("Type: " + vehicleType);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Color: " + color);
    }
}
